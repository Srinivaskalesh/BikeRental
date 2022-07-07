package com.rentalBikes.RentalBikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentalBikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalBikesApplication.class, args);
	}

}

public class OutputPrinter {
	  public void welcome() {
	    printWithNewLine("Welcome to Bike Rental Sevice.");
	  }
	  public void end() {
	    printWithNewLine("Thanks for using Bike Rental service.");
	  }
	  public void notFound() {
	    printWithNewLine("Not found");
	  }

	  public void statusHeader() {
	    printWithNewLine("Bike No.\tRegistration No.\");
	    printWithNewLine("Bike No.    Registration No");
	  }

	  public void parkingLotFull() {
	    printWithNewLine("Sorry, All bikes are booked");
	  }
	  public void parkingLotEmpty() {
	    printWithNewLine("Bikes are Available now");
	  }
	  public void invalidFile() {
	    printWithNewLine("Invalid file given.");
	  }
	  public void printWithNewLine(final String msg) {
	    System.out.println(msg);
	  }
	}
	
	
	 public void execute(Command command) {
	    outputPrinter.statusHeader();
	    for (Bike bikeNo : BookedBikes) {
	      final Bike Booking = bikeNo.getBikeBooking();
	      outputPrinter.printWithNewLine(bikeNo.getBikeNumber()
	          + "\t\t" + parkedBike.getRegistrationNumber());
	      final String bikeNumber = bikeNo.getBikeNumber().toString();

	      outputPrinter.printWithNewLine(padString(bikeNumber, 67)
	          + padString(parkedBike.getRegistrationNumber(), 47));
	    }
	  }

	  private static String padString(final String word, final int length) {
	    String newWord = word;
	    for(int count = word.length(); count < length; count++) {
	      newWord = newWord + " ";
	    }
	    return newWord;
	  }
	}


	public class StatusCommandExecutor extends CommandExecutor {
		  public static String COMMAND_NAME = "status";
		  public StatusCommandExecutor(final RentalBikeService rentalBikeService,
		      final OutputPrinter outputPrinter) {
		    super(rentalBikeService, outputPrinter);
		  }
		  /**
		   * {@inheritDoc}
		   */
		  @Override
		  public boolean validate(final Command command) {
		    return command.getParams().isEmpty();
		  }
		  /**
		   * {@inheritDoc}
		   */
		  @Override
		  public void execute(Command command) {
		    final List<Bike> bookedBikes = rentalBikeService.getBookedBikes();
		    if (bookedBike.isEmpty()) {
		      outputPrinter.bookedBikesEmpty();
		      return;
		    }
		    outputPrinter.statusHeader();
		    for (BikeNo bikeNo : bookedBikes) {
		      final Bike Booked = bike.getBookedBike();
		      outputPrinter.printWithNewLine(bike.getBookedBikeNumber()
		          + "\t\t" +BookedBike.getRegistrationNumber()
		          );
		      final String bikeNumber = bikeNo.getBikeNumber().toString();

		      outputPrinter.printWithNewLine(padString(bikeNumber, 67)
		          + padString(bookedBike.getRegistrationNumber(), 47));
		    }
		  }

		  private static String padString(final String word, final int length) {
		    String newWord = word;
		    for(int count = word.length(); count < length; count++) {
		      newWord = newWord + " ";
		    }
		    return newWord;
		  }
		}














