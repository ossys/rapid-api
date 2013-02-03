package com.purlogic.ae;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class RandomGenerator {
	private static final char[] symbols = new char[62];
	private static final Random random = new Random();
	static {
		for (int idx = 0; idx < 10; ++idx) {
			symbols[idx] = (char) ('0' + idx);
		}
		for (int idx = 10; idx < 36; ++idx) {
			symbols[idx] = (char) ('a' + idx - 10);
		}
		for (int idx = 36; idx < 62; ++idx) {
			symbols[idx] = (char) ('A' + idx - 36);
		}
//		symbols[62] = ' ';
	}

	public static enum DistributionType {
		UNIFORM,
		NORMAL,
		POISSON
	}
	
	public static enum AttributeType {
		NUM,
		TEXT,
		BOOLEAN,
		ENUM,
		DATE,
		BINARY
	}

	public static String generateRandomString(DistributionType prob_dist, int length) {
		StringBuilder sb = new StringBuilder();

		sb.append(symbols[RandomGenerator.generateRandomInt(prob_dist, 10, 61)]);
		for(int i=0; i<length-1; i++) {
			sb.append(symbols[Math.abs(RandomGenerator.random.nextInt())%symbols.length]);
		}

		return sb.toString();
	}

	public static String generateRandomString(DistributionType prob_dist, int minlength, int maxlength) {
		StringBuilder sb = new StringBuilder();

		int rand = (int)(((long)(RandomGenerator.random.nextDouble()*(long)((long)maxlength - (long)minlength + 1))) + minlength);
		sb.append(symbols[RandomGenerator.generateRandomInt(prob_dist, 10, 61)]);
		for(int i=0; i<rand-1; i++) {
			sb.append(symbols[Math.abs(RandomGenerator.random.nextInt())%symbols.length]);
		}

		return sb.toString();
	}

	public static long generateRandomLong() {
		return RandomGenerator.random.nextLong();
	}

	public static long generateRandomLong(DistributionType prob_dist, long min, long max) {
		return (((long)(RandomGenerator.random.nextDouble()*(max - min + 1))) + min);
	}

	public static int generateRandomInt() {
		return RandomGenerator.random.nextInt();
	}

	public static int generateRandomInt(DistributionType prob_dist, int min, int max) {
		return (int)(((int)(RandomGenerator.random.nextDouble()*(int)((int)max - (int)min + 1))) + min);
	}

	public static short generateRandomShort() {
		return (short)RandomGenerator.random.nextInt();
	}

	public static short generateRandomShort(DistributionType prob_dist, short min, short max) {
		return (short)(((short)(RandomGenerator.random.nextDouble()*(short)((short)min - (short)min + 1))) + min);
	}

	public static double generateRandomDouble() {
		return (double)RandomGenerator.random.nextDouble();
	}

	public static double generateRandomDouble(DistributionType prob_dist, double min, double max) {
		return (double)(((double)(RandomGenerator.random.nextDouble()*(double)((double)min - (double)min + 1))) + min);
	}

	public static float generateRandomFloat() {
		return (float)RandomGenerator.random.nextInt();
	}

	public static float generateRandomFloat(DistributionType prob_dist, float min, float max) {
		return (float)(((float)(RandomGenerator.random.nextDouble()*(float)((float)min - (float)min + 1))) + min);
	}

	public static Calendar generateRandomDate(DistributionType prob_dist) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTimeInMillis(RandomGenerator.generateRandomLong(prob_dist, 1100000000000L,1300000000000L));
		return cal;
	}

	public static boolean generateRandomBoolean(double prob_true) {
		if(RandomGenerator.random.nextDouble() < prob_true) {
			return true;
		} else {
			return false;
		}
	}

	public static AttributeType generateRandomAttributeType() {
		double d = RandomGenerator.random.nextDouble();
		if(d < .03) {
			return AttributeType.BINARY;
		} else if(d >= .03 && d < .20) {
			return AttributeType.BOOLEAN;
		} else if(d >= .20 && d < .22) {
			return AttributeType.DATE;
		} else if(d >= .22 && d < .35) {
			return AttributeType.ENUM;
		} else if(d >= .35 && d < .60) {
			return AttributeType.NUM;
		} else {
			return AttributeType.TEXT;
		}
	}

}