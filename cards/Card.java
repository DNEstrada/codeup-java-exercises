package cards;

public class Card {
     public String suit;
     public int value;
     public String color;
     public String name;
     // constructor
     public Card(String suit, String name){
          this.suit = suit;
          this.name = name;
          switch(suit){
               case "Hearts":
               case "Diamonds":
                    this.color = "red";
                    break;
               case "Clubs":
               case "Spades":
                    this.color = "black";
                    break;
          }
          switch(name){
               case "2":
                    this.value = 2;
                    break;
               case "3":
                    this.value = 3;
                    break;
               case "4":
                    this.value = 4;
                    break;
               case "5":
                    this.value = 5;
                    break;
               case "6":
                    this.value = 6;
                    break;
               case "7":
                    this.value = 7;
                    break;
               case "8":
                    this.value = 8;
                    break;
               case "9":
                    this.value = 9;
                    break;
               case "10":
               case "Jack":
               case "Queen":
               case "King":
                    this.value = 10;
                    break;
               case "Ace":
                    this.value = 11;
                    break;
          }
     }
     public void flip(){
          System.out.println("A " + this.name + " of " + this.suit + " (value: " + this.value + ", color: " + this.color + ")");     }
}