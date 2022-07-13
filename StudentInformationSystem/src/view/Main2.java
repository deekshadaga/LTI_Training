import java.util.Random;

public class Batsman2 {
	public static void main(String[] args) {
		Random random = new Random();
		int total_score = 0, score = 0, total_score_5 = 0, avg_score = 0;
		int num_1 = 0, num_2 = 0, num_3 = 0, num_4 = 0, num_6 = 0;
		float strike_rate = 0, total_strike_rate = 0, avg_sr = 0;
		int balls = 0;

		for (int k = 0; k < 5; k++) {
			for (int j = 0; j < 5; j++) {
				for (int i = 0; i < 6; i++) {
					score = random.nextInt(7) + 1; // Score generation
					total_score = total_score + score;
					switch (score) {
					case 1:
						num_1++;
						break;
					case 2:
						num_2++;
						break;
					case 3:
						num_3++;
						break;
					case 4:
						num_4++;
						break;
					case 6:
						num_6++;
						break;
					}
					balls++;
				}
			}
			total_score_5 = total_score_5 + total_score;
			avg_score = (total_score_5 / 5);
			strike_rate = (total_score / balls) * 100;
			total_strike_rate = total_strike_rate + strike_rate;
			avg_sr = (total_strike_rate / 5);
		}

		System.out.println("Average Score:" + avg_score);
		System.out.println("Total runs:" + total_score_5);
		System.out.println("Total Number of 1s:" + num_1);
		System.out.println("Total Number of 2s:" + num_2);
		System.out.println("Total Number of 3s:" + num_3);
		System.out.println("Total Number of 4s:" + num_4);
		System.out.println("Total Number of 6s:" + num_6);

		System.out.println("Average Strike_rate:" + avg_sr);
	}

}
