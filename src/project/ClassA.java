package project;
import java.util.Scanner;
public class ClassA {
 
	static int ALL_qty=1;
	static int items=0;
	static float tot_cost;
	static float discount; 
	//
	static int f_m_cost;
	static int f_m_qty;
	static int tot_mang_c=0;
	
	//
	static int f_a_cost;
	static int f_a_qty;
	static int tot_appl_c=0;
	//
	static int f_b_cost;
	static int f_b_qty;
	static int tot_banan_c=0;
	//
	static int f_p_cost;
	static int f_p_qty;
	static int tot_papa_c=0;
	//
	static int f_g_cost;
	static int f_g_qty;
	static int tot_grap_c=0;
	//
	
	static int f_o_cost;
	static int f_o_qty;
	static int tot_oran_c=0;
	//
	static int v_t_cost;
	static int v_t_qty;
	static int tot_tomat_c;
	static int v_pota_cost;
	static int v_pota_qty;
	static int tot_pota_c=0;
	//
	static int v_capsi_cost;
	static int v_capsi_qty;
	static int tot_capsi_c=0;
	//
	static int v_carr_cost;
	static int v_carr_qty;
	static int tot_carr_c=0;
	//
	static int v_beet_cost;
	static int v_beet_qty;
	static int tot_beet_c=0;
	//
	static int v_lf_cost;
	static int v_lf_qty;
	static int tot_lf_c=0;
	//
	static int c_lipstic_cost;
	static int c_lipstic_qty;
	static int tot_lipstic_c=0;
	//
	static int c_blush_cost;
	static int c_blush_qty;
	static int tot_blush_c=0;
	//
	static int c_moist_cost;
	static int c_most_qty;
	static int tot_moist_c=0;
	//
	static int c_fnd_cost;
	static int c_fnd_qty;
	static int tot_fnd_c=0;
	//
	static int c_kajal_cost;
	static int c_kajal_qty;
	static int tot_kajal_c=0;
	//
	static int c_el_cost;
	static int c_el_qty;
	static int tot_el_c=0;
	//
	
	static int t_aeropl_cost;
	static int t_aeropl_qty;
	static int tot_aeropl_=0;
	//
	static int t_car_cost;
	static int t_car_qty;
	static int tot_car_c=0;
	//
	static int t_barb_cost;
	static int t_barb_qty;
	static int tot_barb_c=0;
	//
	static int t_pz_cost;
	static int t_pz_qty;
	static int tot_pz_c=0;
	//
	static int t_tb_cost;
	static int t_tb_qty;
	static int tot_tb_c=0;
	//
	static int t_dh_cost;
	static int t_dh_qty;
	static int tot_dh_c=0;
	//
	
	static int g_sphn_cost;
	static int g_sphn_qty;
	static int tot_sphn_c=0;
	//
	static int g_epods_cost;
	static int g_epods_qty;
	static int tot_epods_c=0;
	//
	static int g_lapt_cost;
	static int g_lapt_qty;
	static int tot_lapt_c=0;
	//
	static int g_sw_cost;
	static int g_sw_qty;
	static int tot_sw_c=0;
	//
	static int g_cam_cost;
	static int g_cam_qty;
	static int tot_cam_c=0;
	//
	static int g_bs_cost;
	static int g_bs_qty;
	static int tot_bs_c=0;
	Scanner sc =new Scanner(System.in);
	void product()
	{
		System.out.println("==============Welcome to  smart store============");
		System.out.println();
		System.out.println("==================================================");
		System.out.println("| 1) Fruits              |");
		System.out.println(" | 2) Vegetables         |");
		System.out.println("    3) cosmotics          |");
		System.out.println("       4) Toys             |");
		System.out.println("|         5) Gadgets        |");
		System.out.println("");
		System.out.println("please enter your choice:");
		System.out.println("=================================================");
		int choice=sc.nextInt();
		if(choice>=1 && choice<=5)
		{
			if(choice==1) {
				 fruit();
				 
		}
			else if(choice==2) {
				
				vegetable();
			}
			else if(choice==3) {
			     cosmotics();
			}
			else if(choice==4) {
				    toys();
			}
			else if(choice==5) {
				gadgets();
			}
		}
			else {
				System.out.println("--->>please enter a valid code<<----");
				System.out.println("------------------------------------");
				System.out.println("");
				product();
			}
				
	}	
	void fruit() {
		System.out.println("-----------------------------------------");
		System.out.println("|---------111)Mangoes------1kg is 50 |");
		System.out.println("|----------222)Apples------1kg is 100 |");
		System.out.println(" |---------333)Bananas------1kg is 25  |");
		System.out.println("|-----------444)papaya------1kg is 44  |");
		System.out.println("|-----------115)grapes-------1kg is  60 |");
		System.out.println("|------------116)Oranges------1kg is 50  |");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("please enter your choice ?  ");
		int fruitcode=sc.nextInt();
		System.out.println("----------------------------------------------");
		if((fruitcode>=111)&&(fruitcode<=116))
		{
			if(fruitcode==111)
			{
				//mangoes
				System.out.println("mangoes is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_m_cost=M_kgs*50;
				f_m_qty=f_m_qty+M_kgs;
				tot_mang_c=tot_mang_c+f_m_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_m_cost+"rs");
				System.out.println("-------------------------------------------------");						
			}
			
			else	if(fruitcode==112)
			{
				//apples
				System.out.println("apples is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_a_cost=M_kgs*100;
				f_a_qty=f_a_qty+M_kgs;
				tot_appl_c=tot_appl_c+f_a_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_a_cost+"rs");
				System.out.println("-------------------------------------------------");
			}
			
			else	if(fruitcode==113)
			{
				//banana
				System.out.println("banana is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_b_cost=M_kgs*25;
				f_b_qty=f_b_qty+M_kgs;
				tot_banan_c=tot_banan_c+f_b_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_b_cost+"rs");
				System.out.println("-------------------------------------------------");
		}
			
			else	if(fruitcode==114)
			{
				//papaya
				System.out.println("papaya is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_p_cost=M_kgs*44;
				f_p_qty=f_p_qty+M_kgs;
				tot_papa_c=tot_papa_c+f_p_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_p_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			
			else if(fruitcode==116)
			{
				//grapes
				System.out.println("grapes is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_g_cost=M_kgs*60;
				f_g_qty=f_g_qty+M_kgs;
				tot_grap_c=tot_grap_c+f_g_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_g_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			else	if(fruitcode==115)
			{
				//orange 
				System.out.println("orange is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				f_o_cost=M_kgs*50;
				f_o_qty=f_o_qty+M_kgs;
				tot_oran_c=tot_oran_c+f_o_cost;
				System.out.println("------------------------------------------------");
				System.out.println(f_o_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
		
	}//if block
			
			do {
				System.out.println("if you want go to main menu press 1 ");
				System.out.println("if you want to continue with shopping press 2");
				System.out.println("if you want go to go for billing press press 3");
				System.out.println("if you want to exit press 4");
				System.out.println("------------------------------------------------");
				int cx=sc.nextInt();
				System.out.println("====================================================");
				if(cx>=1 && cx<=4)
				{
					if(cx==1) {
						product();
						break;
					}
					else if(cx==2) {
						fruit();
						break;
					}
					else if(cx==3) {
						billing_list();
						break;
						
					}
					else if(cx==4) {
						new ClassA().exit();
						break;
					}
				}//if close 
					else {
						
						System.out.println("--->please enter a valid code<------------");
					} 
			}
					while(true);			
			 // do close 
		
	
}
		
	void vegetable() {
		System.out.println("-----------------------------------------");
		System.out.println("|---------117)Tomato------1kg is 20 |");
		System.out.println("|----------118)Potato------1kg is 5 |");
		System.out.println(" |---------119)capsicum------1kg is 25 |");
		System.out.println("|-----------120)carrot------1kg is 40 |");
		System.out.println("|-----------121)betroot-------1kg is  30 |");
		System.out.println("|------------122)ladiesfinger------1kg is 20  |");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("please enter your choice ?  ");
		int vegcode=sc.nextInt();
		System.out.println("----------------------------------------------");
		if((vegcode>=117)&&(vegcode<=122))
		{
			if(vegcode==117)
			{
				//tomato
				System.out.println("tomato is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_t_cost=M_kgs*20;
				f_m_qty=f_m_qty+M_kgs;
				tot_tomat_c=tot_tomat_c+v_t_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_t_cost+"rs");
				System.out.println("-------------------------------------------------");						
			}
			
			else	if(vegcode==118)
			{
				//potato
				System.out.println("potato is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_pota_cost=M_kgs*5;
				v_pota_qty=v_pota_qty+M_kgs;
				tot_pota_c=tot_pota_c+v_pota_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_pota_cost+"rs");
				System.out.println("-------------------------------------------------");
			}
			
			else	if(vegcode==119)
			{
				//capsicum
				System.out.println("capsicum is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_capsi_cost=M_kgs*25;
				v_capsi_qty=v_capsi_qty+M_kgs;
				tot_capsi_c=tot_capsi_c+v_capsi_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_capsi_cost+"rs");
				System.out.println("-------------------------------------------------");
		}
			
			else	if(vegcode==120)
			{
				//carrot
				System.out.println("carrot is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_carr_cost=M_kgs*40;
				v_carr_qty=v_carr_qty+M_kgs;
				tot_carr_c=tot_carr_c+v_carr_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_carr_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			
			else if(vegcode==121)
			{
				//beettroot
				System.out.println("beetroot is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_beet_cost=M_kgs*60;
				v_beet_qty=v_beet_qty+M_kgs;
				tot_beet_c=tot_beet_c+v_beet_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_beet_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			else	if(vegcode==122)
			{
				//ladiesfinger 
				System.out.println("ladiesfinger is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				v_lf_cost=M_kgs*20;
				v_lf_qty=v_lf_qty+M_kgs;
				tot_lf_c=tot_lf_c+v_lf_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_lf_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
		
	}//if block
			
			do {
				System.out.println("if you want go to main menu press 1 ");
				System.out.println("if you want to continue with shopping press 2");
				System.out.println("if you want go to go for billing press press 3");
				System.out.println("if you want to exit press 4");
				System.out.println("------------------------------------------------");
				int cx=sc.nextInt();
				System.out.println("====================================================");
				if(cx>=1 && cx<=4)
				{
					if(cx==1) {
						product();
						break;
					}
					else if(cx==2) {
						vegetable();
						break;
					}
					else if(cx==3) {
						billing_list();
						break;
						
					}
					else if(cx==4) {
						new ClassA().exit();
						break;
					}
				}//if close 
					else {
						
						System.out.println("--->please enter a valid code<------------");
					} 
			}
					while(true);			
			 // do close 
		
	
}
	
	void cosmotics() {
		System.out.println("-----------------------------------------");
		System.out.println("|---------123)Lipstick------1kg is 99 |");
		System.out.println("|----------124)Blusher------1kg is 330 |");
		System.out.println(" |---------125)Moisturizer------1kg is 347 |");
		System.out.println("|-----------126)Foundation------1kg is 180 |");
		System.out.println("|-----------127)Kajal-------1kg is  261 |");
		System.out.println("|------------128)Eye liner------1kg is 364  |");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("please enter your choice ?  ");
		int cosm_code=sc.nextInt();
		System.out.println("----------------------------------------------");
		if((cosm_code>=123)&&(cosm_code<=128))
		{
			if(cosm_code==123)
			{
				//lipstick
				System.out.println("lipstick is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_lipstic_cost=M_kgs*99;
				c_lipstic_qty=c_lipstic_qty+M_kgs;
				tot_lipstic_c=tot_lipstic_c+c_lipstic_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_lipstic_cost+"rs");
				System.out.println("-------------------------------------------------");						
			}
			
			else	if(cosm_code==124)
			{
				//blusher
				System.out.println("blusher is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_blush_cost=M_kgs*330;
				c_blush_qty=c_blush_qty+M_kgs;
				tot_blush_c=tot_blush_c+c_blush_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_blush_cost+"rs");
				System.out.println("-------------------------------------------------");
			}
			
			else	if(cosm_code==125)
			{
				//moisturaizer
				System.out.println("moisturaizer is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_moist_cost=M_kgs*347;
				c_most_qty=c_most_qty+M_kgs;
				tot_moist_c=tot_moist_c+c_moist_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_moist_cost+"rs");
				System.out.println("-------------------------------------------------");
		}
			
			else	if(cosm_code==126)
			{
				//foundation
				System.out.println("foundation is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_fnd_cost=M_kgs*180;
				c_fnd_qty=c_fnd_qty+M_kgs;
				tot_fnd_c=tot_carr_c+c_fnd_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_fnd_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			
			else if(cosm_code==127)
			{
				//kajal
				System.out.println("kajal is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_kajal_cost=M_kgs*261;
				c_kajal_qty=c_kajal_qty+M_kgs;
				tot_kajal_c=tot_kajal_c+c_kajal_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_kajal_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			else	if(cosm_code==128)
			{
				//eyelancer 
				System.out.println("eyelancer is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				c_el_cost=M_kgs*364;
				c_el_qty=c_el_qty+M_kgs;
				tot_el_c=tot_el_c+c_el_cost;
				System.out.println("------------------------------------------------");
				System.out.println(c_el_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
		
	}//if block
			
			do {
				System.out.println("if you want go to main menu press 1 ");
				System.out.println("if you want to continue with shopping press 2");
				System.out.println("if you want go to go for billing press press 3");
				System.out.println("if you want to exit press 4");
				System.out.println("------------------------------------------------");
				int cx=sc.nextInt();
				System.out.println("====================================================");
				if(cx>=1 && cx<=4)
				{
					if(cx==1) {
						product();
						break;
					}
					else if(cx==2) {
						cosmotics();
						break;
					}
					else if(cx==3) {
						billing_list();
						break;
						
					}
					else if(cx==4) {
						new ClassA().exit();
						break;
					}
				}//if close 
					else {
						
						System.out.println("--->please enter a valid code<------------");
					} 
			}
					while(true);			
			 // do close 
		
	
}
	
	
	void toys() {
		System.out.println("-----------------------------------------");
		System.out.println("|---------129)aeroplane------1pc is 250 |");
		System.out.println("|----------130)hotwheel car------1pc is 200 |");
		System.out.println(" |---------131)barbie------1pc is 350 |");
		System.out.println("|-----------132)puzzle------1pc is 400 |");
		System.out.println("|-----------133)teddy bear-------1pc is  4000 |");
		System.out.println("|------------134)dolly house------1pc is 500  |");
		System.out.println("--------------------------------------------");
		System.out.println("");
		System.out.println("please enter your choice ?  ");
		int toys_code=sc.nextInt();
		System.out.println("----------------------------------------------");
		if((toys_code>=129)&&(toys_code<=134))
		{
			if(toys_code==129)
			{
				//aeroplane
				System.out.println("aeroplane is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_aeropl_cost=M_kgs*250;
				t_aeropl_qty=t_aeropl_qty+M_kgs;
				tot_aeropl_=tot_aeropl_+t_aeropl_cost;
				System.out.println("------------------------------------------------");
				System.out.println(t_aeropl_cost+"rs");
				System.out.println("-------------------------------------------------");						
			}
			
			else	if(toys_code==130)
			{
				//hot wheel car
				System.out.println("hotwheel car is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_car_cost=M_kgs*200;
				t_car_qty=t_car_qty+M_kgs;
				tot_car_c=tot_car_c+t_car_cost;
				System.out.println("------------------------------------------------");
				System.out.println(v_pota_cost+"rs");
				System.out.println("-------------------------------------------------");
			}
			
			else	if(toys_code==131)
			{
				//barbie
				System.out.println("barbie is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_barb_cost=M_kgs*350;
				t_barb_qty=t_barb_qty+M_kgs;
				tot_barb_c=tot_barb_c+t_barb_cost;
				System.out.println("------------------------------------------------");
				System.out.println(t_barb_cost+"rs");
				System.out.println("-------------------------------------------------");
		}
			
			else	if(toys_code==132)
			{
				//puzzle
				System.out.println("puzzle is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_pz_cost=M_kgs*400;
				t_pz_qty=t_pz_qty+M_kgs;
				tot_pz_c=tot_pz_c+t_pz_cost;
				System.out.println("------------------------------------------------");
				System.out.println(t_pz_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			
			else if(toys_code==133)
			{
				//teddy bear
				System.out.println("teddy bear is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_tb_cost=M_kgs*400;
				t_tb_qty=t_tb_qty+M_kgs;
				tot_tb_c=tot_tb_c+t_tb_cost;
				System.out.println("------------------------------------------------");
				System.out.println(t_tb_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
			else	if(toys_code==134)
			{
				//dollyhouse 
				System.out.println("dolly house is good choice.how many kgs you need ?");
				System.out.println("----------------------------------------------");
				System.out.println("please enter your choice ");
				int M_kgs=sc.nextInt();
				t_dh_cost=M_kgs*500;
				t_dh_qty=t_dh_qty+M_kgs;
				tot_dh_c=tot_dh_c+t_dh_cost;
				System.out.println("------------------------------------------------");
				System.out.println(t_dh_cost+"rs");
				System.out.println("-------------------------------------------------");
				
			}
		
	}//if block
			
			do {
				System.out.println("if you want go to main menu press 1 ");
				System.out.println("if you want to continue with shopping press 2");
				System.out.println("if you want go to go for billing press press 3");
				System.out.println("if you want to exit press 4");
				System.out.println("------------------------------------------------");
				int cx=sc.nextInt();
				System.out.println("====================================================");
				if(cx>=1 && cx<=4)
				{
					if(cx==1) {
						product();
						break;
					}
					else if(cx==2) {
						toys();
						break;
					}
					else if(cx==3) {
						billing_list();
						break;
						
					}
					else if(cx==4) {
						new ClassA().exit();
						break;
					}
				}//if close 
					else {
						
						System.out.println("--->please enter a valid code<------------");
					} 
			}
					while(true);			
			 // do close 
	}
			void gadgets() {
				System.out.println("-----------------------------------------");
				System.out.println("|---------135)smartphone------1pc is 16000 |");
				System.out.println("|----------136)earpods------1pc is 5000 |");
				System.out.println(" |---------137)laptops------1pc is 50000 |");
				System.out.println("|-----------138)smartwatch------1pc is 4000 |");
				System.out.println("|-----------139)camera-------1pc is  5000 |");
				System.out.println("|------------140)bluethoot------1kg is 2000  |");
				System.out.println("--------------------------------------------");
				System.out.println("");
				System.out.println("please enter your choice ?  ");
				int gadget_code=sc.nextInt();
				System.out.println("----------------------------------------------");
				if((gadget_code>=135)&&(gadget_code<=140))
				{
					if(gadget_code==135)
					{
						//smartphone
						System.out.println("smartphone is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_sphn_cost=M_kgs*16000;
						g_sphn_qty=g_sphn_qty+M_kgs;
						tot_sphn_c=tot_sphn_c+g_sphn_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_sphn_cost+"rs");
						System.out.println("-------------------------------------------------");						
					}
					
					else	if(gadget_code==136)
					{
						//earpods
						System.out.println("earpods is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_epods_cost=M_kgs*5000;
						g_epods_qty=g_epods_qty+M_kgs;
						tot_epods_c=tot_epods_c+g_epods_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_epods_cost+"rs");
						System.out.println("-------------------------------------------------");
					}
					
					else	if(gadget_code==137)
					{
						//laptop
						System.out.println("laptop is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_lapt_cost=M_kgs*50000;
						g_lapt_qty=g_lapt_qty+M_kgs;
						tot_lapt_c=tot_lapt_c+g_lapt_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_lapt_cost+"rs");
						System.out.println("-------------------------------------------------");
				}
					
					else	if(gadget_code==139)
					{
						//camera
						System.out.println("camera is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_cam_cost=M_kgs*5000;
						g_cam_qty=g_cam_qty+M_kgs;
						tot_cam_c=tot_cam_c+g_cam_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_cam_cost+"rs");
						System.out.println("-------------------------------------------------");
						
					}
					
					else if(gadget_code==138)
					{
						//smartwatch
						System.out.println("smartwatch is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_sw_cost=M_kgs*4000;
						g_sw_qty=g_sw_qty+M_kgs;
						tot_sw_c=tot_sw_c+g_sw_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_sw_cost+"rs");
						System.out.println("-------------------------------------------------");
						
					}
					else	if(gadget_code==122)
					{
						//bluethoot
						System.out.println("bluethoot is good choice.how many kgs you need ?");
						System.out.println("----------------------------------------------");
						System.out.println("please enter your choice ");
						int M_kgs=sc.nextInt();
						g_bs_cost=M_kgs*2000;
						g_bs_qty=g_bs_qty+M_kgs;
						tot_bs_c=tot_bs_c+g_bs_cost;
						System.out.println("------------------------------------------------");
						System.out.println(g_bs_cost+"rs");
						System.out.println("-------------------------------------------------");
						
					}
				
			}//if block
					
					do {
						System.out.println("if you want go to main menu press 1 ");
						System.out.println("if you want to continue with shopping press 2");
						System.out.println("if you want go to go for billing  press 3");
						System.out.println("if you want to exit press 4");
						System.out.println("------------------------------------------------");
						int cx=sc.nextInt();
						System.out.println("====================================================");
						if(cx>=1 && cx<=4)
						{
							if(cx==1) {
								product();
								break;
							}
							else if(cx==2) {
								gadgets();
								break;
							}
							else if(cx==3) {
								billing_list();
								break;
								
							}
							else if(cx==4) {
								new ClassA().exit();
								break;
							}
						}//if close 
							else {
								
								System.out.println("--->please enter a valid code<------------");
							} 
					}
							while(true);			
					 // do close 		
	
}
			
			void billing_list()
			{
				System.out.println("");
				System.out.println("");
				System.out.println("======welcome to smart store===============");
				System.out.println("          smart store          ");
				System.out.println("                                ");
				System.out.println(" ph:123456789");

			System.out.println("-------------------------------------------------------");
			System.out.print("product name");
			System.out.print("  product code   ");
			System.out.print("  quantity  ");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print("");
			System.out.print(" Qtty ");
			System.out.print("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" total cost ");
			
			
			if(f_m_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("mangoes");
				System.out.println("111");
			//	System.out.println("");
			//	System.out.println("");
				//System.out.println("");
			//	System.out.println("");
			//	System.out.println("");
			//	System.out.println("");
				System.out.println("i"+f_m_qty);
				//System.out.println("");
			//	System.out.println("");
				//System.out.println("");
				//System.out.println("");
			//	System.out.println("");
			//	System.out.println("tot_m_c");
			//	System.out.println("");
				
			}
			if(f_a_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("apple");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+f_a_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_appl_c");
				System.out.println("");
				
			}
			
			if(f_b_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("banana");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+f_b_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_banan_c");
				System.out.println("");
				
			}
			
			if(f_p_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("papaya");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+f_p_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_papa_c");
				System.out.println("");
				
			}
			if(f_g_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("grapes");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+f_g_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_grap_c");
				System.out.println("");
				
			}
			if(f_o_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("mangoes");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+f_o_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_oran_c");
				System.out.println("");
				
			}
			if(v_t_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("tomato");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_t_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_tomat_c");
				System.out.println("");
				
			}
			if(v_pota_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("potatoes");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_pota_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_pota_c");
				System.out.println("");
				
			}
			
			if(v_capsi_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("mangoes");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_capsi_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_capsi_c");
				System.out.println("");
				
			}
			if(v_carr_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("carrot");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_carr_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_carr_c");
				System.out.println("");
				
			}
			if(v_beet_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("beethroot");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_beet_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_beet_c");
				System.out.println("");
				
			}
			if(v_lf_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("lady fingers ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+v_lf_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_lf_c");
				System.out.println("");
				
			}
			if(c_lipstic_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("lipstick");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_lipstic_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_lipstic_c");
				System.out.println("");
				
			}
			if(c_blush_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("blush ");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_blush_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_blush_c");
				System.out.println("");
				
			}
			if(c_most_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("moisturiser");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_most_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_moist_c");
				System.out.println("");
				
			}
			if(c_fnd_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("fnd");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_fnd_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_fnd_c");
				System.out.println("");
				
			}
			if(c_kajal_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("kajal");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_kajal_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_kajal_c");
				System.out.println("");
				
			}
			if(c_el_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("ell");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+c_el_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_el_c");
				System.out.println("");
				
			}
			if(t_aeropl_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("aeroplanes");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_aeropl_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_aeropl_c");
				System.out.println("");
				
			}
			if(t_car_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("toy carss");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_car_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_car_c");
				System.out.println("");
				
			}
			if(t_barb_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("barbie");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_barb_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_barb_c");
				System.out.println("");
				
			}
			if(t_pz_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("pzz");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_pz_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_pz_c");
				System.out.println("");
				
			}
			if(t_tb_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("teddy bear");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_tb_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_tb_c");
				System.out.println("");
				
			}
			if(t_dh_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("ddh");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+t_dh_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_dh_c");
				System.out.println("");
				
			}
			if(g_sphn_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("smart phone");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_sphn_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_sphn_c");
				System.out.println("");
				
			}
			if(g_epods_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("epods");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_epods_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_epods_c");
				System.out.println("");
				
			}
			if(g_lapt_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("laptop");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_lapt_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_lapt_c");
				System.out.println("");
				
			}
			if(g_sw_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("smart watch");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_sw_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_sw_c");
				System.out.println("");
				
			}
			if(g_cam_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("ccamera");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_cam_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_cam_c");
				System.out.println("");
				
			}
			if(g_bs_qty>=1) {
				++items;
				System.out.println("");
				System.out.println("bss");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("i"+g_bs_qty);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("tot_bs_c");
				System.out.println("");
				
			}

 tot_cost=tot_mang_c+tot_appl_c+tot_banan_c+tot_papa_c+tot_grap_c+tot_oran_c+tot_tomat_c+tot_pota_c+tot_capsi_c+tot_carr_c+tot_beet_c+tot_lf_c+tot_lipstic_c+tot_blush_c+tot_moist_c+tot_fnd_c+tot_kajal_c+tot_el_c+tot_aeropl_+tot_car_c+tot_barb_c+tot_pz_c+tot_tb_c+tot_dh_c+tot_sphn_c+tot_epods_c+tot_lapt_c+tot_sw_c+tot_cam_c+tot_bs_c;
 System.out.println("the total bill is "+tot_cost);
    
		
			}

	void tot_billing()	{
		if(tot_cost>=500)
		{
			discount=(tot_cost*5/100);
			System.out.println("you received a discount of 5%"+discount+"rs");
			System.out.println("");
			float final_bill=(tot_cost-discount);
			System.out.println("finalbill is "+final_bill+"rs");
			System.out.println("");
			
		}
		else
		{
			float final_bill=(tot_cost);
			System.out.println("final bill"+final_bill+"rs");
			System.out.println("");
		}
		System.out.println("you saved "+discount+"rs/- on mrp");
		System.out.println("");
		System.out.println("*******<<<<thank u for shopping >>>>>>********");
		System.out.println("");
	}
	void exit() {
		ALL_qty=ALL_qty*0;
		System.out.println("------------------- the end --------------------------------");
		
	}
		public static void main(String[] args) {
			new ClassA().product();
			if(tot_cost>0)
			{
				new ClassA().tot_billing();
			}
			}	
			
}
		
     

	
	
	
	
	
