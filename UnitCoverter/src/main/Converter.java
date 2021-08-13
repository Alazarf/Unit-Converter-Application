package main;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Converter {
		
		static double result;
		static double input;
		static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			int menuSelection = 0;
			int subMenuSelection = 0;	
			
			 while(menuSelection != 4) {
			
				 try {
					System.out.println(" Select an option");
					System.out.println("1. Temprature Converter");
					System.out.println("2. Time Converter");
					System.out.println("3. Mass Converter");
					System.out.println("4. Quit");
					menuSelection = scanner.nextInt();	

					switch(menuSelection) {
					case 1: 
						while (subMenuSelection != 7) {
							System.out.println("Please select an option");
							System.out.println("1. Feranite to Celsius");
							System.out.println("2. Celsius to Feranite");
							System.out.println("3. Kelvin  to Celsius");
							System.out.println("4. Celsius  to Kelvin");
							System.out.println("5. Kelvin to Feranite");
							System.out.println("6. Feranite to Kelvin");
							System.out.println("7. Return to the main menu");
							
							subMenuSelection = scanner.nextInt();
							scanner.nextLine();
							switch(subMenuSelection) {
							case 1:
								System.out.println(getValues() + " Feranite are " + convertFeranitetoCelsius(input) + " Celsius." );
								break;
							case 2:
								System.out.println(getValues() + " Celsius are " + convertCelsiusToFeranite(input) + " Feranite." );
								break;
							case 3:
								System.out.println(getValues() + " Kelvin are " + convertKelvinToCelsius(input) + " Celsius");
								break;
							case 4:
								System.out.println(getValues() + " Celsius are " + convertCelsiusToKelvin(input) + " Kelvin");
								break;
							case 5:
								System.out.println(getValues() + " Kelvin are " + convertKelvinToFeranite(input) + " Feranite");
								break;
							case 6:
								System.out.println(getValues() + " Feranite are " + convertFeraniteToKelvin(input) + " Kelvin");
								break;
							case 7:
								System.out.println("Returning to the main menu.");
								break;
							default:
								System.out.println("Invalid option. Please select from 1 to 7.");							
							}
							System.out.println();
						}
						break;
					case 2:
						while (subMenuSelection != 6) {
							System.out.println("Please select an option");
							System.out.println("1. Microseconds to Nanoseconds");
							System.out.println("2. Milliseconds to Microseconds");
							System.out.println("3. Seconds to Milliseconds");
							System.out.println("4. Minutes to Seconds");
							System.out.println("5. Hours to Minutes");
							System.out.println("6. Return to the main menu");
							subMenuSelection = scanner.nextInt();
							scanner.nextLine();
							switch(subMenuSelection) {
							case 1:
								System.out.println(getValues() + " Microseconds are " + convertMicrosecondsToNanoseconds(input) + " Nanoseconds." );
								break;
							case 2:
								System.out.println(getValues() + " Milliseconds are " + convertMillisecondsToMicroseconds(input) + " Microseconds." );
								break;
							case 3:
								System.out.println(getValues() + " Seconds are " + convertSecondsToMilliseconds(input) + " Milliseconds." );
								break;
							case 4:
								System.out.println(getValues() + " Minutes are " + convertMinutesToSeconds(input) + " Seconds." );
								break;
							case 5:
								System.out.println(getValues() + " Hours are " + convertHoursToMinutes(input) + " Minutes." );
								break;
							case 6:
								System.out.println("Returning to the main menu.");
								break;
							default:
								System.out.println("Invalid option. Please select from 1 to 6.");							
							}
							System.out.println();
						}
						break;
					case 3:
						while (subMenuSelection !=4) {
							System.out.println("Please select an option");
							System.out.println("1. Pounds to Kilogramss");
							System.out.println("2. Kilograms to Pounds");
							System.out.println("3. Ounce to Gram");
							System.out.println("4. Return to the main menu");
							subMenuSelection = scanner.nextInt();
							scanner.nextLine();
							switch(subMenuSelection) {
							case 1:
								System.out.println(getValues() + " pounds are " + convertPoundsToKilograms(input) + " kilograms." );
								break;
							case 2:
								System.out.println(getValues() + " kilograms are " + convertKilogramsToPounds(input) + " pounds." );
								break;
							case 3:
								System.out.println(getValues() + " Ounces are " + convertOuncesToGrams(input) + " grams.");
							case 4:
								System.out.println("Returning to the main menu.");
								break;
							default:
								System.out.println("Invalid option. Please select from 1 to 4.");
								
							}
							System.out.println();
						}
						break;
					case 4:
						System.out.println("Thank you for using Unit Converter application.");
						break;
						
					default:
						System.out.println("Invalid option. Please select from 1 to 4.");
						
					}	
					}catch(InputMismatchException e) {
						System.out.println("Please use positive integer number.");
						scanner.nextLine();
					}
			}	
			scanner.close(); 
		}
		public static double getValues()
		{
			System.out.println("Enter the value you want to covert:");
			input = scanner.nextDouble();
			scanner.nextLine();
			return input;
		}
		public static double convertFeranitetoCelsius(double qty)
		{
			result = (qty - 32) * 0.55555555555;
			return result;
		}
		public static double convertCelsiusToFeranite(double qty)
		{
			result = (qty * 1.8) + 32;
			return result;
		}
		public static double convertKelvinToCelsius(double qty)
		{
			result = qty - 273.15;
			return result;
		}
		public static double convertCelsiusToKelvin(double qty)
		{
			result = qty + 273.15;
			return result;
		}
		public static double convertKelvinToFeranite(double qty)
		{
			result = (qty - 273.15) * 1.8 + 32;
			return result;
		}
		public static double convertFeraniteToKelvin(double qty)
		{
			result = (qty - 32) * 0.55555555555 + 273.15;
			return result;
		}
		public static double convertMicrosecondsToNanoseconds(double qty)
		{
			result = qty * 1000 ;
			return result;
		}
		public static double convertMillisecondsToMicroseconds(double qty)
		{
			result = qty * 1000;
			return result;
		}
		public static double convertSecondsToMilliseconds(double qty)
		{
			result = qty * 1000;
			return result;
		}
		public static double convertMinutesToSeconds(double qty)
		{
			result = qty * 60;
			return result;
		}
		public static double convertHoursToMinutes(double qty)
		{
			result = qty * 60;
			return result;
		}
		public static double convertPoundsToKilograms(double qty)
		{
			result = qty * 0.453592 ;
			return result;
		}
		public static double convertKilogramsToPounds(double qty)
		{
			result = qty * 2.20462;
			return result;
		}
		public static double convertOuncesToGrams(double qty)
		{
			result = qty * 28.3495;
			return result;
		}
	}


