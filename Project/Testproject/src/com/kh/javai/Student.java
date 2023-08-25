package com.kh.javai;

// class�뿉 �젒洹쇱젣�븳�옄瑜� �꽕�젙�븯吏� �븡�쑝硫�
// default濡� �꽕�젙�릺怨� �떎瑜� �뙣�궎吏��뿉�꽌 �궗�슜�븷 �닔 �뾾�떎.
public class Student {
	//�븘�뱶(�뜲�씠�꽣 吏묓빀)
	public static int count = 0; // 珥� �븰�깮�쓽 �닔
	private String name; //�굹�씠
	private int age; //�굹�씠
	private String gender; //�꽦蹂�
	private int mathScore; //�닔�븰�젏�닔
	private int enScore; // �쁺�뼱�젏�닔
	private int koScore; // 援��뼱�젏�닔
	
	//�깮�꽦�옄
	//�씤�뒪�꽩�뒪 媛앹껜瑜� �깮�꽦�븷 �뻹 �뜲�씠�꽣瑜� 珥덇린�솕�븯湲곗쐞�빐
	//�옄�룞�쑝濡� �븳踰덈쭔 �떎�뻾�븯�뒗 �듅蹂꾪븳 硫붿꽌�뱶
	//硫붿꽌�뱶泥섎읆 �젒洹쇳빐�꽌 �떎�뻾�븷 �닔 �뾾�쑝硫� class�쓽 �씠由꾧낵 �룞�씪�븳 �씠由꾩쓣 媛�吏꾨떎.
	//珥덇린�솕瑜� �쐞�븳 硫붿꽌�뱶�씠湲� �븣臾몄뿉 諛섑솚媛믪� �뾾�떎.
	/* 湲곕낯�깮�꽦�옄
	 * �깮�꽦�옄瑜� �븘臾닿쾬�룄 �옉�꽦�븯吏� �븡�븯�쓣 �븣
	 * 而댄뙆�씪�윭媛� 湲곕낯�쟻�쑝濡� �깮�꽦�빐二쇰뒗 �깮�꽦�옄
	 * (�븘臾� 湲곕뒫�씠 �뾾�떎.)
	 * public Student(){}
	 */
	public Student(){
		System.out.println("student�쓽 湲곕낯�깮�꽦�옄");
	}
	//�깮�꽦�옄�뒗 �뿬�윭媛� �깮�꽦�씠 媛��뒫�븯�떎.
	//�깮�꽦�옄媛� �뿬�윭媛쒖씪�븣�뒗 留ㅺ컻蹂��닔瑜� �넻�빐�꽌 �떇蹂꾪븳�떎.
	//�뿉留ㅽ븳 �깮�꽦�옄�뒗 �궗�슜�쓣 吏��뼇�븳�떎.
	public Student(String tName, int tAge, String tGender){
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("�씠由� : " + name);
		System.out.println("�굹�씠 : " + age);
		System.out.println("�꽦蹂� : " + gender);
		System.out.println("�븰�깮�씠 異붽��릺�뿀�뒿�땲�떎.");
	}
	
	
	
	//硫붿꽌�뱶(湲곕뒫 吏묓빀)
	//info硫붿꽌�뱶 �깮�꽦
	//���뒗 oo�궡�쓽 �긽oo ooo�엯�땲�떎. 異쒕젰湲곕뒫
	public void info() {
		System.out.println(name + "\t" + age + "\t" + gender);
	}
	
	//set硫붿꽌�뱶(setter) => �븘�뱶�뜲�씠�꽣�뿉 媛믪쓣 ���옣�븯湲곗쐞�븳 硫붿꽌�뱶
	public void setEnScore(int tEnScore) {
		if (tEnScore < 0) {
			enScore = 0;
			return;
		}
		enScore = tEnScore;
	}
	
	public void setKoScore(int tKoScore) {
		if (tKoScore < 0) {
			koScore = 0;
			return;
		}
		koScore = tKoScore;
	}
	
	public void setMathScore(int tMathScore) {
		if (tMathScore < 0) {
			mathScore = 0;
			return;
		}
		mathScore = tMathScore;
	}
	
	//get硫붿꽌�뱶(getter) => �븘�뱶�뜲�씠�꽣�뿉 媛믪쓣 �궗�슜�븯湲� �쐞�븳 硫붿꽌�뱶
	public int getEnScore() {
		return enScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	public int getKoScroe() {
		return koScore;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// 湲곕뒫�쓣 �떞�떦�븯�뒗 硫붿꽌�뱶
	// �넗�깉媛믪쓣 諛섑솚�븯�뒗 硫붿꽌�뱶
	public int getTotal() {
		int total = (mathScore + koScore + enScore);
		return total;
	}
	
	public float getAvg() {
	//	int total = (mathScore + koScore + enScore);
		return (getTotal()/3.0f);
	}
	
	//�빀寃⑹씤吏� 遺덊빀寃⑹씤吏� 寃곌낵瑜� 異쒕젰�빐二쇰뒗 硫붿꽌�뱶
	public void checkPass() {
		if (koScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			System.out.print("�빀寃⑹엯�땲�떎.");
		} else {
			System.out.print("遺덊빀寃⑹엯�땲�떎.");
		}
	}
	
	public boolean checkPassIsTrue() {
		if (koScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	//displayMyInfo 硫붿꽌�뱶瑜� 留뚮뱾�뼱蹂댁옄
	// 留ㅺ쾶蹂��닔�뒗 �뾾怨�
	//由ы꽩媛믩룄 議댁옱�븯吏��븡�뒗�떎.
	// �떎�뻾�빐 寃곌낵濡�
	// ���뒗 oo�궡�쓽 ooo�엯�땲�떎.
	// 援��뼱 : 00�젏
	// �쁺�뼱 : 00�젏
	// �닔�븰 : 00�젏
	// �빀怨� : 00�젏
	// �룊洹� : 00�젏
	// �쑝濡� �떆�뿕�뿉 �빀寃⑺븯���뒿�땲�떎.
	
	public void displayMyInfo() {
		// ���뒗 oo�궡�쓽 ooo�엯�땲�떎.
		System.out.println("���뒗 "+age+"�궡�쓽 "+name+"�엯�땲�떎.");
		// 援��뼱 : 00�젏
		System.out.println("援��뼱 : " + koScore);
		// �쁺�뼱 : 00�젏
		System.out.println("�쁺�뼱 : " + enScore);
		// �닔�븰 : 00�젏
		System.out.println("�닔�븰 : " + mathScore);
		// �빀怨� : 00�젏
		System.out.println("�빀怨� : " + getTotal());
		// �룊洹� : 00�젏
		System.out.println("�룊洹� : " + getAvg());
		
		if(checkPassIsTrue()) {
			System.out.println("�쑝濡� �떆�뿕�뿉 �빀寃⑺븯���뒿�땲�떎.");
		} else {
			System.out.println("�쑝濡� �떆�뿕�뿉 遺덊빀寃⑺븯���뒿�땲�떎.");
		}
	}
	
	// 留ㅺ쾶蹂��닔 媛믨낵 媛앹껜�쓽 �뜲�씠�꽣媛� �룞�씪�븯�떎硫� true, �븘�땲硫� false瑜� 諛섑솚
	public boolean equals(String name, int age, String gender){
		if (this.name.equals(name) && this.age == age && this.gender.equals(gender)) {
			return true;	
		} else 
			return false;
	}
	
	public static int showCount() {
		return count;
	}
	
	
}
