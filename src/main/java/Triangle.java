public class Triangle {
	public String IsTriangle(int x,int y,int z) {
		//make sure "x>y>z"
		int temp = x;
		if (x<y) {
			x = y;
			y = temp;
		}
		if (z>x) {
			temp = z;
			z = y;
			y = x;
			x = temp;
		}else if (z>y) {
			temp = z;
			z = y;
			y = temp;
		}
		//decide x,y,z can be a triangle
		if (x<y+z) {
			if (x*x>y*y+z*z) {
				if (y==z) {
					return "���y�w���T����";
				}
				return "�w���T����";
			}else if (x*x==y*y+z*z) {
				return "�����T����";
			}else if (x*x<y*y+z*z) {
				if (x==y&&y==z) {
					return "���T����";
				}else if (x==y || y==z) {
					return "���y�U���T����";
				}
				return "�U���T����";
			}
		}
		return "���O�T����";
	}
}
