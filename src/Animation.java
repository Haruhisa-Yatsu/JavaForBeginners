
public class Animation extends MyFrame {

	private float _updateSecond = 0.03f;

	public void run() {

		//Practice5_1();
		//Practice5_2();

		//Practice5_3();
		//Practice5_EX();
		Practice5_EX2();
	}

	private void Practice5_1() {
		int y = 200;
		int x = 30;

		while (y >= 100) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y -= 5;
			sleep(_updateSecond);
		}
		while (x <= 200) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			x += 5;
			sleep(_updateSecond);
		}

	}

	private void Practice5_2() {
		int y = 30;
		int x = 30;

		while (y <= 200) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y += 5;
			x += 5;
			sleep(_updateSecond);
		}
		while (x >= 30) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			x -= 5;
			sleep(_updateSecond);
		}
		while (y >= 30) {
			//(1)画面を消す
			clear();

			//(2)四角形を表示する
			setColor(0, 128, 0);
			fillOval(x, y, 100, 100);

			y -= 5;
			x += 5;
			sleep(_updateSecond);
		}
	}

	private void Practice5_3() {
		int y = 100;
		int x = 30;

		for (int i = 0; i < 3; i++) {
			while (x <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x += 5;
				sleep(_updateSecond);
			}
			while (x >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x -= 5;
				sleep(_updateSecond);
			}

		}
	}

	private void Practice5_EX() {
		int y = 30;
		int x = 30;

		while (true) {
			while (x <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x += 5;
				sleep(_updateSecond);
			}
			while (y <= 200) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y += 5;
				sleep(_updateSecond);
			}
			while (x >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x -= 5;
				sleep(_updateSecond);

			}
			while (y >= 30) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y -= 5;
				sleep(_updateSecond);

			}
		}
	}

	private void Practice5_EX2() {
		int y = 30;
		int x = 30;
		// 折り返しごとに下に移動する量
		int moveDown = 50;

		// 下に移動する目標
		int targetY = y + moveDown;

		// 今の移動方向
		boolean isRight = true;

		while (true) {

			while (IsRight(isRight, x)) {

				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				x += isRight ? 5 : -5;
				sleep(_updateSecond);
			}
			isRight = !isRight;
			while (y <= targetY) {
				//(1)画面を消す
				clear();

				//(2)四角形を表示する
				setColor(0, 128, 0);
				fillOval(x, y, 100, 100);

				y += 5;
				sleep(_updateSecond);
			}
			targetY += moveDown;
		}
	}

	private boolean IsRight(boolean isRight, int x) {
		if (isRight) {
			return x <= 200;
		} else {
			return x >= 30;
		}

	}
}
