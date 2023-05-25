import java.util.*;
class flight
{
	Scanner scan = new Scanner(System.in);//declaring scanner class
	//Global Variable
	int count = 0;

	//dashboard
	String country_name;
	String company_name;
	String username;
	String password;

	//case 1
	int aircraft_buying_price[] = new int[100];
	int aircraft_price_num[] = new int[15];
	String aircraft_name[] = new String[15];
	String aircraft_price_word[] = new String[15];
	String aircraft_capacity[] = new String[15];
	String aircraft_bought[] = new String[100];
	String airplane_choice;
	String buy_sell_logout;
	int total_bill_buy_sell;
	int count_buy = 0;
	int total_buying_bill = 0;
	int total_selling_bill = 0;
	int choice_buy_plane = 0;
	int choice_count_plane = 0;
	int choice_sell_plane = 0;

	//case 2
	int aircrafts_routes_distance[] = new int[15];
	String aircrafts_routes[] = new String[15];
	int choice_routes = 0;
	int choice_routes_aircraft = 0;
	int choice_route_plane = 0;
	int choice_route_plane_2 = 0;
	int fuel_price = 0;
	String plane_assigned[] = new String[100];
	long routes_bill = 0;

	//case 3
	int choice_maintain_plane_2 = 0;
	int choice_maintain_plane = 0;
	int choice_maintain_plane_3 = 0;
	int maintain_bill_1 = 0;
	int maintain_bill_2 = 0;
	int maintain_bill_3 = 0;
	int maintain_bill_4 = 0;
	int total_bill_maintain = 0;
	String maintain_logout;

	// case 5
	String market_logout;
	int marketing_choice = 0;
	int kiosk_number;
	int kiosk_time;
	int hoarding_number = 0;
	int hoarding_time = 0;
	int ad_time = 0;
	int ad_channel = 0;
	int ad_number = 0;
	int campaign_number = 0;
	int campaign_time = 0;
	long kiosk_bill = 0;
	long hoarding_bill = 0;
	long ad_bill = 0;
	long campaign_bill = 0;
	long total_bill_advertisement = 0;

	// case 6
	int catering_choice = 0;
	int osteria_number = 0;
	int osteria_time = 0;
	int celler_channel = 0;
	int celler_time = 0;
	int celler_number = 0;
	int mirazur_number = 0;
	int eleven_number = 0;
	int eleven_time = 0;
	long osteria_bill = 0;
	long celler_bill = 0;
	long mirazur_bill = 0;
	long eleven_bill = 0;
	long total_bill_catering = 0;
	String catering_logout;

	//case 7
	int stock_owned = 0;
	int stock_owned_1 = 0;
	int stock_price_2 = 0;
	int stock_buy = 0;
	int total = 0;
	int stock_sell = 0;
	int stock_max = 500;
	double stock_bill = 0;
	double stock_price = 0;
	String stock_choice_2;
	String stock_choice_3;

	//case 8
	int final_bill = 0;
	double easter_egg = 0;
	String choice_logout;
	String credit_card_number;

void Login()
{
	System.out.println("*-----------------------------------------------*");
	System.out.print("*Write your company name:-    ");
	company_name = scan.nextLine();
	System.out.println("*-----------------------------------------------*");
	System.out.print("*Username-                    ");
	username = scan.next(); //validation done
	System.out.println("------------------------------------------------*");
	System.out.print("*Password-                    ");
	password = scan.next();
	System.out.println("*-----------------------------------------------*");
if ((password.equalsIgnoreCase("admin")) && (Character.isAlphabetic(username.charAt(0))))
	{
		System.out.println("*Access Granted!                                *");
System.out.println("*-----------------------------------------------*");
System.out.println("****************************************************
********");
	}
	else
	{
		System.out.println("*Access Denied!                                 *");
		System.out.println("*-----------------------------------------------*");
System.out.println("****************************************************
****");
		System.exit(0);
	}
	System.out.println("*Welcome to " + company_name + " Pvt. Ltd.*");
System.out.println("*Select a city from which you want to start the company.*");	System.out.print("*Enter the name of the city:- ");
	country_name = scan.next();
System.out.println("************************************************************");
}
	
void Case_1() //Buy or sell plane
{
	aircraft_name[0] = "Aerospatiale 72-600        	";
	aircraft_name[1] = "Airbus 350-800             	";
aircraft_name[2] = "Airbus A380                	";
	aircraft_name[3] = "Boeing 717-200             	";
	aircraft_name[4] = "Boeing 747 400             	";
	aircraft_name[5] = "Boeing 777-200LR           	";
	aircraft_name[6] = "Comac C919                 	";
	aircraft_name[7] = "McDonnell Douglas MD-80    	";
	aircraft_name[8] = "McDonnell Douglas-11ER     	";
	aircraft_name[9] = "Sukhoi KR-860              	";
	aircraft_name[10] = "Airbus Beluga             	";
	aircraft_name[11] = "Antonov An-124 Ruslan     	";
	aircraft_name[12] = "Antonov An-22             	";
	aircraft_name[13] = "Boeing C-17 Globemaster III    ";
	aircraft_name[14] = "Lockheed C-5 Galaxy            ";

	aircraft_price_word[0] = "$445.6 million      ";
	aircraft_price_word[1] = "$240 million        ";
	aircraft_price_word[2] = "$50 million         ";
	aircraft_price_word[3] = "$50 million         ";
	aircraft_price_word[4] = "$22.7 million       ";
	aircraft_price_word[5] = "$317.4 million      ";
	aircraft_price_word[6] = "$74.48 million      ";
	aircraft_price_word[7] = "$17 million         ";
	aircraft_price_word[8] = "$147.5 million      ";
	aircraft_price_word[9] = "$444.04 million     ";
	aircraft_price_word[10] = "$204.3 million      ";
	aircraft_price_word[11] = "$262.75 million     ";
	aircraft_price_word[12] = "$204 million        ";
	aircraft_price_word[13] = "$254 million        ";
	aircraft_price_word[14] = "$218 million        ";

	aircraft_price_num[0] = 445600000;
	aircraft_price_num[1] = 240000000;
	aircraft_price_num[2] = 500000000;
	aircraft_price_num[3] = 500000000;
	aircraft_price_num[4] = 227000000;
	aircraft_price_num[5] = 317400000;
	aircraft_price_num[6] = 744800000;
	aircraft_price_num[7] = 170000000;
	aircraft_price_num[8] = 147500000;
	aircraft_price_num[9] = 444040000;
	aircraft_price_num[10] = 204300000;
	aircraft_price_num[11] = 262700000;
	aircraft_price_num[12] = 204000000;
	aircraft_price_num[13] = 254000000;
	aircraft_price_num[14] = 218000000;

	aircraft_capacity[0] = "853 passengers    ";
	aircraft_capacity[1] = "700 Passengers    ";
	aircraft_capacity[2] = "330 Passengers    ";
	aircraft_capacity[3] = "330 Passengers    ";
	aircraft_capacity[4] = "74 passangers     ";
	aircraft_capacity[5] = "270 passengers    ";
	aircraft_capacity[6] = "300 passengers    ";
	aircraft_capacity[7] = "106 passengers    ";
	aircraft_capacity[8] = "410 passengers    ";
	aircraft_capacity[9] = "860 passengers    ";
	aircraft_capacity[10] = "90 tonnes         ";
	aircraft_capacity[11] = "138 tonnes        ";
	aircraft_capacity[12] = "122.5 tonnes      ";
	aircraft_capacity[13] = "140 tonnes        ";
	aircraft_capacity[14] = "127.5 tonnes      ";
	
buy_sell: for (;;)
	{
		System.out.println("*************************************");
		System.out.println("*what action would you like to make:*");
		System.out.println("*buy planes................(press b)*");
		System.out.println("*sell planes...............(press s)*");
		System.out.println("*exit to home page.........(press e)*");
		System.out.println("*************************************");
		airplane_choice = scan.next().toLowerCase(); // Buy or sell plane
		switch (airplane_choice)
		{
		case "b":
System.out.println("***********************************************************************************************************");
			for (count = 0; count < 15; count++)
			{
System.out.println("*---------------------------------------------------------------------------------------------------------");
				System.out.println("*|" + aircraft_name[count] + "  " + 
aircraft_capacity[count] + "  " + aircraft_price_word[count] + ".......Press " + count);
			}
System.out.println("*---------------------------------------------------------------------------------------------------------*");
System.out.println("***********************************************************************************************************");
			System.out.print("*how many Aircrafts do you want to Buy-");
			choice_count_plane = scan.nextInt();
			System.out.println("***************************************");
				if (choice_count_plane > 0)
				{
					for (count = 0; count < choice_count_plane; count++, 
count_buy++)
					{
System.out.println("*********************************");
System.out.println("*Which plane do you want to buy *");
						System.out.print("*Enter the choice-");
						choice_buy_plane = scan.nextInt();
System.out.println("*********************************")
aircraft_bought[count_buy] = aircraft_name[choice_buy_plane];
aircraft_buying_price[count_buy] = aircraft_price_num[choice_buy_plane];
total_buying_bill = total_buying_bill + aircraft_price_num[choice_buy_plane];
					}
System.out.println("=========================================================");
System.out.println("Your total bill is:- Rs." + total_buying_bill);
System.out.println("=========================================================");
					break;
				}
				elsse 
break;
		case "s":
		if (aircraft_bought.length > 0)
		{
System.out.println("**************************************************************");
			for (count = 0; count < aircraft_bought.length; count++)
			{
			if (aircraft_buying_price[count] == 0)
			{
				break;
			}
System.out.println("*---------------------------------------------------------------------------------------------------------*");
			System.out.println("*|" + aircraft_bought[count] + "     " + 
aircraft_buying_price[count] + ".......Press " + count + "*");
}
System.out.println("**************************************************************");
System.out.println("--------------------------------------");
			System.out.print("how many Aircrafts do you want to sell-");
			choice_count_plane = scan.nextInt();
System.out.println("**********************************");
			for (count = 0; count < choice_count_plane; count++)
			{
				System.out.println("*Which planes do you want to 
sell*");
				System.out.print("*Enter the choice-");
				choice_sell_plane = scan.nextInt();
				aircraft_bought[choice_sell_plane] = "Sold";
				total_selling_bill = (total_selling_bill + 
aircraft_buying_price[choice_sell_plane]) * -1;
				aircraft_buying_price[choice_sell_plane] = 0000;
			}
System.out.println("**********************************");
System.out.println("=========================================================");
			System.out.println("Your total bill is:-  Rs." + total_selling_bill);
System.out.println("=========================================================");
			break;
		}
		else if (aircraft_bought.length == 0)
		{
			System.out.println("******************************");
			System.out.println("*You do not own any aircrafts*");
			System.out.println("******************************");
			return;
		}
	
		case "e":
			System.out.println("***********************************");
			System.out.println("*Are You Sure!!!.............(y/n)*");
			System.out.println("***********************************");
			buy_sell_logout = scan.next().toLowerCase();
			total_bill_buy_sell = total_buying_bill + total_selling_bill;
			if (buy_sell_logout.equals("y"))
			{
System.out.println("=================================================");
System.out.println(" Bill = Rs." + total_bill_buy_sell + "    "); //bill
System.out.println("=================================================");
break buy_sell ; //break infinite loop to go directly to dashboard loop
			}
			else if (buy_sell_logout.equals("n"))
			{
	break;
			}
			break;
			
default:
			System.out.println("*************************************");
			System.out.println("*Please choose an appropriate letter*");
			System.out.println("*************************************");
			System.out.print("\n");
			break;
		}
	}
}
void Case_2()//Route management
{
	aircrafts_routes[0] = " to Bangkok     ";
	aircrafts_routes[1] = " to Brazil      ";
	aircrafts_routes[2] = " to Congo       ";
	aircrafts_routes[3] = " to Dubai       ";
	aircrafts_routes[4] = " to Hong kong   ";
	aircrafts_routes[5] = " to Las Vegas   ";
	aircrafts_routes[6] = " to London      ";
	aircrafts_routes[7] = " to Los Angeles ";
	aircrafts_routes[8] = " to New York    ";
	aircrafts_routes[9] = " to Paris       ";
	aircrafts_routes[10] = " to Singapore   ";
	aircrafts_routes[11] = " to Sydney      ";
	aircrafts_routes[12] = " to Tokyo       ";
	aircrafts_routes[13] = " to Torronto    ";
	aircrafts_routes[14] = " to Venezuela   ";

	aircrafts_routes_distance[0] = 3040;
	aircrafts_routes_distance[1] = 13760;
	aircrafts_routes_distance[2] = 6570;
	aircrafts_routes_distance[3] = 1941;
	aircrafts_routes_distance[4] = 4280;
	aircrafts_routes_distance[5] = 13820;
	aircrafts_routes_distance[6] = 7220;
	aircrafts_routes_distance[7] = 14000;
	aircrafts_routes_distance[8] = 12450;
	aircrafts_routes_distance[9] = 7000;
	aircrafts_routes_distance[10] = 3920;
	aircrafts_routes_distance[11] = 10160;
	aircrafts_routes_distance[12] = 6740;
	aircrafts_routes_distance[13] = 12500;
	aircrafts_routes_distance[14] = 14540;

	route: for (;;)
	{
		fuel_price = (int)(Math.random() * 1000);
System.out.println("*******************************************************");
System.out.println("*current fuel price is:- RS." + fuel_price + "                        *");
System.out.println("*******************************************************");
		for (count = 0; count <= 99999999; count++) {} //delay loop
		for (count = 0; count < aircraft_bought.length; count++)
		{
			if (aircraft_bought[count] == null)
			{
				if (count == 0)
				{
System.out.println("******************************");
System.out.println("*You do not own any aircrafts*");
System.out.println("******************************");
					return;
				}
				break;
			}
System.out.println("************************************************************************");
System.out.println("*----------------------------------------------------------------------*");
System.out.println("*|" + aircraft_bought[count] + "     .......Press " + count);
		}
System.out.println("************************************************************************");
System.out.println("*Choose number of plane you want to assign routes.*");
System.out.println("***************************************************");
		choice_route_plane = scan.nextInt();
		System.out.println("************************************");
		for (count = 0; count < choice_route_plane; count++)
		{
			System.out.println("*----------------------------------*");
			System.out.println("*Which plane do you want to assign *");
			System.out.print("*Enter the choice-");
			choice_route_plane_2 = scan.nextInt();
plane_assigned[count] = aircraft_bought[choice_route_plane_2];
		}
		System.out.println("************************************");
System.out.println("*******************************************************");
System.out.println("*You can only buy " + choice_route_plane + " routes 									*");
System.out.println("*******************************************************");
		for (count = 0; count < 15; count++)
		{
System.out.println("---------------------------------------------------------------------------");
			
System.out.println(country_name + "" + aircrafts_routes[count] + "  ..... Press-" + count);
		}
System.out.println("---------------------------------------------------------------------------");
		for (count = 1; count <= choice_route_plane; count++)
		{
System.out.println("---------------------------------------------------------------------------");
			System.out.println("pick the route you want");
			choice_routes = scan.nextInt();
routes_bill = routes_bill + ((int)(aircrafts_routes_distance[choice_routes] / 5) * fuel_price);
		}
System.out.println("=========================================================");
		System.out.println("Bill:- Rs." + routes_bill);
System.out.println("=========================================================");
		break;
	}
}

void Case_3()//Maintenance
{
	for (count = 0; count < aircraft_bought.length; count++)
	{
		if (aircraft_bought[count] == null)
		{
			if (count == 0)
			{
				System.out.println("******************************");
				System.out.println("*You do not own any aircrafts*");
				System.out.println("******************************");
				return;
			}
			break;
		}
System.out.println("************************************************************************");
System.out.println("*----------------------------------------------------------------------*");
System.out.println("*|" + aircraft_bought[count] + "     .......Press " + count + "                    *");
	}
System.out.println("************************************************************************");
	System.out.println("*Choose number of plane you want to maintain.*");
	System.out.println("**********************************************");
	choice_maintain_plane = scan.nextInt();
	System.out.println("********************************************");
	for (count = 0; count < choice_maintain_plane; count++)
	{
System.out.println("*Which planes do you want to mainatain     *");
		System.out.print("*Enter your choice-");
		choice_maintain_plane_2 = scan.nextInt();
		plane_assigned[count] = aircraft_bought[choice_maintain_plane_2];
	}
	System.out.println("********************************************");
	maintain: for (;;)
	{
System.out.println("**************************************************************");
System.out.println("*What type of maintenance do you want your planes to undergo?*");
System.out.println("*General maintenance.......(press 1)                         *");
System.out.println("*Engine maintenance........(press 2)                         *");
System.out.println("*Cleaning maintenance......(press 3)                         *");
System.out.println("*Wing maintenance..........(press 4)                         *");
		System.out.println("*Logout....................(press 5)                         *");
System.out.println("**************************************************************");
		choice_maintain_plane_3 = scan.nextInt();
		switch (choice_maintain_plane_3)
		{
			case 1:
System.out.println("******************************************************");
System.out.println("*Cost of General maintenance per plane = Rs.10,00,000*");
System.out.println("******************************************************");
				maintain_bill_1 = choice_maintain_plane * 1000000;
System.out.println("======================================================");
				System.out.println("Your Bill = Rs." + maintain_bill_1);
System.out.println("======================================================");
				break;

			case 2:
System.out.println("******************************************************");
System.out.println("*Cost of Engine maintenance per plane = Rs.9,45,000  *");
System.out.println("******************************************************");
				maintain_bill_2 = choice_maintain_plane * 945000;
System.out.println("======================================================");
				System.out.println("Your Bill = Rs." + maintain_bill_2);
System.out.println("======================================================");
				break;

			case 3:
System.out.println("******************************************************");
System.out.println("*Cost of Cleaning maintenance per plane = Rs.6,30,000*");
System.out.println("******************************************************");
				maintain_bill_3 = choice_maintain_plane * 630000;
System.out.println("======================================================");
				System.out.println("Your Bill = Rs." + maintain_bill_3);
System.out.println("======================================================");
				break;

			case 4:
System.out.println("******************************************************");
System.out.println("*Cost of Wing maintenance per plane = Rs.8,10,000    *");
System.out.println("******************************************************");
				maintain_bill_4 = choice_maintain_plane * 810000;
System.out.println("======================================================");
				System.out.println("Your Bill = Rs." + maintain_bill_4);
System.out.println("======================================================");
				break;
			case 5:
				System.out.println("***********************************");
				System.out.println("*Are You Sure!!!.............(y/n)*");
				System.out.println("***********************************");
				maintain_logout = scan.next().toLowerCase();
total_bill_maintain = maintain_bill_1 + maintain_bill_2 + maintain_bill_3 + maintain_bill_4;
				if (maintain_logout.equals("y"))
				{
System.out.println("=========================================================");
System.out.println("Bill = Rs." + total_bill_maintain); //bill
System.out.println("=========================================================");
break maintain; //break infinite loop to go directly to dashboard loop
				}
				else
				{
					return;
				}

			default:
				System.out.println("*************************************");
System.out.println("*Please choose an appropriate letter*");
				System.out.println("*************************************");
				System.out.print("\n");
		}
	}
}

void Case_4()//Hanger management
{
	System.out.println("**********************");
	System.out.println("*You have " + choice_count_plane + " Aircrafts*");
	if (choice_count_plane > 0)
	{
		System.out.println("*You have:-          *");
		System.out.println("**********************");
		for (count = 0; count < (choice_count_plane + 10); count++)
		{
			if (aircraft_bought[count] == null)
			{
				return;
			}
			else
			{
System.out.println("---------------------------------------------");
System.out.println("Plane no. " + count + "          " + aircraft_bought[count]);
System.out.println("---------------------------------------------");
			}
		}
System.out.println("---------------------------------------------------------");
		}
	else
	{
		System.out.println("*****************************");
		System.out.println("* No planes in your Hanger *");
		System.out.println("*****************************");
		return;
	}
}

void Case_5()//Advertisement 
{
	market: for (;;) // naming loop to break in future
	{
	System.out.println("****************************************");
		System.out.println("* How would you like to advertise?     *");
		System.out.println("* Kiosk......................(press 1) *");
		System.out.println("* Hoarding...................(press 2) *");
		System.out.println("* Advertisement..............(press 3) *");
		System.out.println("* Campaign...................(press 4) *");
		System.out.println("* Logout.....................(press 5) *");
		System.out.println("****************************************");
		marketing_choice = scan.nextInt();
		switch (marketing_choice) 
		{
		case 1:
System.out.println("*************************************************");
System.out.println("* Base price per kiosk = Rs.4500 per month      *");
System.out.println("* Offers include:                               *");
System.out.println("* 5% discount on 150 kiosk or less per month    *");
System.out.println("* 10% discount on 150 kiosk or more per month   *");
System.out.println("* How many kiosk would you like to buy?         *");
System.out.println("*************************************************");
			kiosk_number = scan.nextInt();
System.out.println("**********************");
System.out.println("*For how many months?*");
System.out.println("**********************");
			kiosk_time = scan.nextInt();
			if (kiosk_number <= 150) 
{
kiosk_bill = kiosk_bill + (Math.round(kiosk_number * kiosk_time * 0.95 * 4500));
			}
			else 
			{
kiosk_bill = kiosk_bill + (Math.round(kiosk_number * kiosk_time * 0.9 * 4500));
}
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + kiosk_bill);
System.out.println("=========================================================");
				break;
		
case 2:
System.out.println("***************************************************************");
System.out.println("* Base price per month = Rs.5,00,000                          *");
System.out.println("* Offers include:                                             *");
System.out.println("* 40 x 12 ft or 12.19 x 3.66 m for Rs.45,00,000.....(press 1) *");
System.out.println("* 48 x 14 ft or 14.63 x 4.27 m for Rs.50,00,000.....(press 2) *");
System.out.println("* 50 x 20 ft or 15.24 x 6.10 m for Rs.57,00,000.....(press 3) *");
System.out.println("* 60 x 16 ft or 18.29 x 4.88 m for Rs.66,00,000.....(press 4) *");
System.out.println("* Which billboard would you like to buy?                      *");
System.out.println("***************************************************************");
			hoarding_number = scan.nextInt();
System.out.println("**********************");
System.out.println("*For how many months?*");
System.out.println("**********************");
			hoarding_time = scan.nextInt();
			if (hoarding_number == 1) 
			{
hoarding_bill = hoarding_bill + (4500000 + (hoarding_time * 500000));
			} 
			else if (hoarding_number == 2) 
			{
hoarding_bill = hoarding_bill + (5000000 + (hoarding_time * 500000));
			} 
			else if (hoarding_number == 3) 
			{
hoarding_bill = hoarding_bill + (5700000 + (hoarding_time * 500000));
			}
			else if (hoarding_number == 4) 
			{
hoarding_bill = hoarding_bill + (6600000 + (hoarding_time * 500000));
			} 
			else 
			{
System.out.println("=========================================================");	
System.out.println("Your bill = Rs." + hoarding_bill);
System.out.println("=========================================================");
break;
			}
System.out.println("=========================================================");	
			System.out.println("Your bill = Rs." + hoarding_bill);
				
System.out.println("=========================================================");
			break;						
	
		case 3:
System.out.println("***********************************************************");
System.out.println("* Base price per advertisement = Rs.11000 per second      *");
System.out.println("* How long do you want the advertisement?....(in seconds) *");
System.out.println("***********************************************************");
			ad_time = scan.nextInt();
System.out.println("*****************************************************************");
System.out.println("* Channels include:                                             *");
System.out.println("* Saab tv - Rs.50,000 per ad..........................(press 1) *");
System.out.println("* Sunny entertainment television - Rs.55,000 per ad...(press 2) *");
System.out.println("* Coloury tv  - Rs.60,000 per ad......................(press 3) *");
System.out.println("* Which channel do you choose?                                  *");
System.out.println("*****************************************************************");
			ad_channel = scan.nextInt();
System.out.println("**********************************************");
System.out.println("*How many times do you want the ad to appear?*");
System.out.println("**********************************************");
			ad_number = scan.nextInt();
			if (ad_channel == 1) 
			{
ad_bill = ad_bill + (ad_time * 11000) + (50000 * ad_number);
			} 
			else if (ad_channel == 2) 
			{
ad_bill = ad_bill + (ad_time * 11000) + (55000 * ad_number);
			} 
			else if (ad_channel == 3) 
			{
ad_bill = ad_bill + (ad_time * 11000) + (60000 * ad_number);
			} 
			else 
			{
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + ad_bill);
System.out.println("=========================================================");
break;
			}
			break;
		case 4:
System.out.println("****************************************************************");
System.out.println("* Base price per campaign = Rs.50,00,000                       *");
System.out.println("* Offers include:                                              *");
System.out.println("* Invite 100 people for Rs.70,00,000 per day..........(press 1) *");
System.out.println("* Invite 250 people for Rs.90,00,000 per day.........(press 2) *");
System.out.println("* Invite 500 people for Rs.1,30,00,000 per day.......(press 3) *");
System.out.println("* Invite 1000 people for Rs.2,00,00,000 per day......(press 4) *");
System.out.println("* Which campaign would you like to host?                       *");
System.out.println("****************************************************************");
			campaign_number = scan.nextInt();
System.out.println("For how many days?");
			campaign_time = scan.nextInt();
			if (campaign_number == 1) 
			{
campaign_bill = campaign_bill + 5000000 + (campaign_time * 700000);
			} 
			else if (campaign_number == 2) 
			{
campaign_bill = campaign_bill + 5000000 + (campaign_time * 900000);
			} 
			else if (campaign_number == 3) 
			{
campaign_bill = campaign_bill + 5000000 + (campaign_time * 13000000);
			} 
			else if (campaign_number == 4) 
			{
campaign_bill = campaign_bill + 5000000 + (campaign_time * 20000000);
			} 
			else 
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + campaign_bill);
System.out.println("=========================================================");
				break;
		case 5:
System.out.println("***********************************");
System.out.println("*Are You Sure!!!.............(y/n)*");
System.out.println("***********************************");
			market_logout = scan.next().toLowerCase();
total_bill_advertisement = kiosk_bill + ad_bill + hoarding_bill + campaign_bill;
(market_logout.equals("y")) 
			{
System.out.println("=================================================");
System.out.println(" Bill = Rs." + total_bill_advertisement + "    "); //bill
System.out.println("=================================================");
break market; //break infinite loop to go directly to dashboard loop
			} 
			else if (market_logout.equals("n")) 
			{
break;
			}
			break;
		Default:
System.out.println("*************************************");
System.out.println("*Please choose an appropriate letter*");
System.out.println("*************************************");
System.out.print("\n");
			break;
		}
	}
}
























void Case_6() // Catering
{
	catering:for(;;)//naming loop to break in future
	{
System.out.println("****************************************");
System.out.println("* Which food service would you like?   *");
System.out.println("* Osteria Francescana........(press 1) *");
System.out.println("* El Celler de Can Roca .....(press 2) *");
System.out.println("* Mirazur....................(press 3) *");
System.out.println("* Eleven Mcellerison Park....(press 4) *");
System.out.println("* logout.....................(press 5) *");
System.out.println("****************************************");
catering_choice = scan.nextInt();
		switch (catering_choice) 
		{						
			case 1:
System.out.println("******************************************************");
System.out.println("* Base price per plate = Rs.5,000                    *");
System.out.println("* Offers include:                                    *");
System.out.println("* Class III plate for Rs.5000 per plate....(press 1) *");	
System.out.println("* Class II plate for Rs.5700 per plate.....(press 2) *");
System.out.println("* Class I plate for Rs.6800 per plate......(press 3) *");
System.out.println("* Buffet for Rs.7200 per plate.............(press 4) *");
System.out.println("* Logout                                   (press 5) *");
System.out.println("* Which service would you like to buy?               *");
System.out.println("******************************************************");
osteria_number = scan.nextInt();
				if (osteria_number == 5) 
				{
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + osteria_bill);
System.out.println("=========================================================");
					break;
				}
System.out.println("*********************");
System.out.println("*For how many plates?*");
System.out.println("*********************");
				osteria_time = scan.nextInt();
				if (osteria_number == 1) 
				{
osteria_bill = osteria_bill + (osteria_time * 10000);
				} 
				else if (osteria_number == 2) 
				{
osteria_bill = osteria_bill + (osteria_time * 10700);
				} 
				else if (osteria_number == 3) 
				{
osteria_bill = osteria_bill + (osteria_time * 11800);
				} 
				else if (osteria_number == 4) 
				{
osteria_bill = osteria_bill + (osteria_time * 12200);
				} 
				else 
				{	break;		}
						
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + osteria_bill);
System.out.println("=========================================================");
				break;
						
case 2:
System.out.println("********************************************");
System.out.println("* Base price per plate = Rs.8000 per plate *");
System.out.println("* How many plates do you want to serve?    *");
System.out.println("********************************************");
celler_time = scan.nextInt();
System.out.println("******************************************************************************");		System.out.println("* Buffets include:                                                           *");			System.out.println("* First + middle + dessert - Rs.50,00,000..........................(press 1) *");			System.out.println("* Starters + first + middle + dessert - Rs.55,00,000...............(press 2) *");
System.out.println("* Starters + first + middle + beverage + dessert - Rs.60,00,00.....(press 3) *");
System.out.println("* Logout                                                           (press 4) *");
System.out.println("* Which service do you choose?                                               *");		System.out.println("******************************************************************************");		celler_channel = scan.nextInt();
				if (celler_channel == 4) 
				{
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + celler_bill);
System.out.println("=========================================================");
					break;
				}
if (celler_channel == 1) 
				{
celler_bill = celler_bill + (celler_time * 8000) + 5000000;
				} 
				else if (celler_channel == 2) 
				{
celler_bill = celler_bill + (celler_time * 88000) + 5500000;
				} 
				else if (celler_channel == 3) 
				{
celler_bill = celler_bill + (celler_time * 8000) + 6000000;
				} 
				else  break;
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + celler_bill);
System.out.println("=========================================================");
				break;
						
											
case 3:
System.out.println("*******************************************************");
System.out.println("* Base price per plate = Rs.9000                      *");
System.out.println("* Parties include:                                    *");
System.out.println("* Invite 100 people for Rs.7,00,000.........(press 1) *");
System.out.println("* Invite 250 people for Rs.9,00,000.........(press 2) *");
System.out.println("* Invite 500 people for Rs.13,00,000........(press 3) *");
System.out.println("* Invite 1000 people for Rs.20,00,000.......(press 4) *");
System.out.println("* Logout                                    (press 5) *");
System.out.println("* Which party would you like to host?                 *");
System.out.println("*******************************************************");
				mirazur_number = scan.nextInt();
				if (mirazur_number==5) 
				{
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + mirazur_bill);
System.out.println("=========================================================");
					break;
				}
				if (mirazur_number == 1) 
				{
mirazur_bill = mirazur_bill+ 900000 + 700000;
				} 
				else if (mirazur_number == 2) 
				{
mirazur_bill = mirazur_bill+ 2250000 + 900000;
				} 
				else if (mirazur_number == 3) 
				{
mirazur_bill = mirazur_bill+ 4500000 + 1300000;
				} 
				else if (mirazur_number == 4) 
				{
mirazur_bill = mirazur_bill + 9000000 + 2000000;
				} 
				else break;
System.out.println("=========================================================");
System.out.println("Your bill = Rs." + mirazur_bill);
System.out.println("=========================================================");
				break;
						
			
			case 4:
System.out.println("**************************************************");
System.out.println("* Base price per plate = Rs.10000 per plate      *");
System.out.println("* Offers include:                                *");
System.out.println("* 5% discount on 10 items or less                *");
System.out.println("* 10% discount on 10 items or more               *");
System.out.println("* Logout                               (press 9) *");
System.out.println("* How many menu items would you like to buy?     *");
System.out.println("**************************************************");
				eleven_number = scan.nextInt();
				if (eleven_number==9) 
				{
System.out.println("================================================");
System.out.println("Your bill = Rs." + eleven_bill);
System.out.println("================================================");
					break;	
				}
System.out.println("*********************");
System.out.println("*For how many plates?*");
System.out.println("*********************");
				eleven_time = scan.nextInt();
				if (eleven_number <= 150) 
				{
eleven_bill = Math.round(eleven_number * eleven_time * 0.95 * 10000);
				} 
				else 
				{
eleven_bill = Math.round(eleven_number * eleven_time * 0.9 * 1000);
				}
System.out.println("================================================");
				System.out.println("Your bill = Rs." + eleven_bill);
System.out.println("================================================");
				break;		

case 5:
System.out.println("***********************************");
System.out.println("*Are You Sure!!!.............(y/n)*");
System.out.println("***********************************");
catering_logout = scan.next().toLowerCase();
total_bill_catering = eleven_bill + celler_bill + osteria_bill + mirazur_bill;
				if (catering_logout.equals("y")) 
				{
System.out.println("*********************************************************");
System.out.println("*Bill = Rs." + total_bill_catering); //bill
System.out.println("*********************************************************");
break catering; //break infinite loop to go directly to dashboard loop
				} 
				else if (catering_logout.equals("n")) 
				{	break;		}
				break;
						

Default:
System.out.println("*************************************");
System.out.println("*Please choose an appropriate letter*");
System.out.println("*************************************");System.out.println("\n");
				break;
		}
	}
}




void Case_7()// Stocks 
{
	for (;;) 
	{
System.out.println("*****************************************************************");
System.out.println("*The current price for the stocks is $6000                      *");
		stock_price = 6000.0;
		System.out.println("*                                                               *");
System.out.println("*Would you like to buy stocks at the base price?.....(yes/exit) *");				System.out.println("*****************************************************************");
stock_choice_2 = scan.next().toLowerCase();
		if (stock_choice_2.equals("yes")) 
		{
System.out.print("\n");
System.out.println("******************************");
System.out.println("*Buy upto 500 shares only    *");
System.out.println("*How many do you want to buy?*");
System.out.println("******************************");
stock_owned += total;
stock_owned += scan.nextInt();
stock_bill = stock_owned * stock_price;
stock_price_2 = (int)((Math.random()) * 10000);
System.out.println("***********************************************");
System.out.println("*your new price is $" + stock_price_2);
System.out.println("***************************************************************************");
System.out.println("*Would you like to buy or sell or exit stocks at second price?.....(b/s/e)*");
System.out.println("***************************************************************************");
stock_choice_3 = scan.next().toLowerCase();
if (stock_choice_3.equals("b")) 
			{
System.out.println("**********************************");
System.out.println("*How many do you want to buy?    *");
System.out.println("**********************************");
				stock_buy = scan.nextInt();
				stock_bill += stock_buy * stock_price_2;
stock_owned += stock_buy;
System.out.println("================================================");
System.out.println("YOUR BILL IS $" + stock_bill);
System.out.println("YOU HAVE TOTAL " + stock_owned + " Stocks");
System.out.println("================================================");
			} 
			else if (stock_choice_3.equalsIgnoreCase("s")) 
			{
				for (;;) 
				{
System.out.println("**********************************");
System.out.println("*How many do you want to sell?   *");
System.out.println("**********************************");
stock_sell = scan.nextInt();
if (stock_owned >= stock_sell) 
{
						stock_bill -= (stock_sell * stock_price_2);
						stock_owned -= stock_sell;
System.out.println("================================================");
System.out.println("YOUR BILL IS $" + stock_bill);
System.out.println("YOU HAVE TOTAL " + stock_owned + " Stocks");
System.out.println("================================================");
break;
					} 
					else 
					{
System.out.println("********************************");
System.out.println("* You don't have enough stocks *");
System.out.println("********************************");
}
				}
			} 
			else if (stock_choice_3.equalsIgnoreCase("e")) 
			{
System.out.println("================================================");
System.out.println("YOUR BILL IS $" + stock_bill);
System.out.println("YOU HAVE TOTAL " + stock_owned + "Stocks");
System.out.println("================================================");
break;
			}
		} 
		else 
		{
			break;
		}
	}
	total += stock_owned;	
}

void Case_8()//logout 
{	
	easter_egg = (Math.random() * 10);
	System.out.println("***********************************");
	System.out.println("*Are You Sure!!!.............(y/n)*");
	System.out.println("***********************************");
	choice_logout = scan.next().toLowerCase();
final_bill = (int)(total_buying_bill + total_selling_bill + routes_bill + total_bill_maintain + total_bill_advertisement + total_bill_catering + stock_bill);
if (choice_logout.equalsIgnoreCase("y")) 
	{
		easter: if (easter_egg >= 9.0) 
		{
System.out.println("==============================================");
System.out.println("Bill = Rs. " + final_bill); //bill
System.out.println("==============================================");
System.out.println("\n");
System.out.println("Hurray!!!!!!!  You have the Easter egg.       ");
System.out.println("Enter your Credit Card Number                 ");
credit_card_number = scan.next().toLowerCase();
cc: for (;;) 
			{
if (credit_card_number.length() == 16) 
				{
System.out.println("********************************************************");
System.out.println("*------------------------------------------------------*");
System.out.println("*10% of Bill is added to this credit card.             *");
System.out.println("*------------------------------------------------------*");
System.out.println("########################################################");
System.out.println("#Complied by Kushal Patel, Keyur Padia and Het Parsania#");
System.out.println("########################################################");
System.out.println("********************************************************");
System.exit(0);
				}
				else 
				{
System.out.println("*****************************")
System.out.println("*Invalid credit card number.*");
System.out.println("*****************************");
	break easter;
				}
			}
		} 
		else 
		{
System.out.println("--------------------------------------------------------");
			System.out.println("Bill = Rs. " + final_bill); //bill
System.out.println("--------------------------------------------------------");
System.out.println("##########################################################");
System.out.println("# Complied by Kushal Patel, Keyur Padia and Het Parsania #");
System.out.println("##########################################################");
			System.exit(0);
		}
	}
	else 
	{
System.out.println("--------------------------------------------------------");
		System.out.println("Bill = Rs. " + final_bill); //bill
System.out.println("--------------------------------------------------------");
System.out.println("##########################################################");
System.out.println("# Complied by Kushal Patel, Keyur Padia and Het Parsania #");
System.out.println("##########################################################");
		System.exit(0);
	}	
}

void Defaultcase() 
{
	System.out.println("\n");
	System.out.println("*************************************");
	System.out.println("*Please choose an appropriate letter*");
	System.out.println("*************************************");
	System.out.print("\n");
}

}











class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		flight f = new flight();
System.out.println("*****************************************");
System.out.println("* Welcome To Airline Management System. *");
System.out.println("*****************************************");
		f.Login();
		main: for (;;) 
		{
System.out.println("*************************************");
System.out.println("*Buy/Sell Plane..............Press 1*");
System.out.println("*Route Management............Press 2*");
System.out.println("*Maintenance.................Press 3*");
System.out.println("*Hanger Management...........Press 4*");	System.out.println("*Marketing...................Press 5*");
			System.out.println("*Catering Services...........Press 6*");
			System.out.println("*Stock Market................Press 7*");
System.out.println("*Logout......................Press 8*");	System.out.println("*************************************");
			int choice_dashboard = scan.nextInt();
			switch (choice_dashboard)
			{
				case 1:
					f.Case_1();
					break;
				
case 2:
					f.Case_2();
					break;

				case 3:
					f.Case_3();
					break;

				case 4:
					f.Case_4();
					break;

				case 5:
					f.Case_5();
					break;

				case 6:
					f.Case_6();
					break;

				case 7:
					f.Case_7();
					break;

				case 8:
					f.Case_8();
					break;

				default:
					f.Default();
					break;
			}
		}
	}
}