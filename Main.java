class Main {
    public static void main(String[] args) {

        //create 2d array 4*8 size
        char[][] text = new char[4][8];

        //going to hold one character from the sentence
        char letter;

        //hold over sentence
        String words = "lazy dog jump over moon";

        //testing if it grabs a word
        letter = words.charAt(0);
        // System.out.println(letter);

        //size of row and column
        int row = 8;
        int column = 4;

        //which coloumn no we are in
        int nocolumn = 0;

        //what is the no of current letter
        int lettercount = 0;

        //iterate no of columns times
        for (int i = 0; i < column; i++) {
            //iterate no of rows times
            for (int j = 0; j < row; j++) {
                //fill the 2d array with #s
                text[i][j] = '#';
            }
        }


        //iterate no of columns times
        for (int i = 0; i < column; i++) {
            //iterate no of rows times
            for (int j = 0; j < row; j++) {
                //check if column is even
                if(nocolumn % 2 == 0){
                    //if current no of letter is less than 23
                    if (lettercount < 23) {
                        //grabs a letter
                        letter = words.charAt(lettercount);
                        //put it into the array
                        text[i][j] = letter;
                        //move to next letter
                        lettercount++;
                    }
                    //if we read all the letters already
                    else{

                        text[i][j] = '*';
                    }
                    System.out.print(text[i][j]);
                    System.out.print('|');
                }
                //if the column is odd number
                else if(nocolumn % 2 != 0) {
                    //if current no of letter is less than 23
                    if (lettercount < 23) {
                        letter = words.charAt(lettercount);
                        text[i][7 - j] = letter;
                        lettercount++;
                        //if we read all the letters already
                    } else {
                        text[i][7 - j] = '*';
                    }
                    //print the array only after done filling a row (row is updated with new content)
                    if(j == 7){
                        for (int k = 0; k < row; k++) {
                            System.out.print(text[i][k]);
                            System.out.print('|');
                        }
                    }
                }
            }
            //increment no of columns
            nocolumn++;
            //go next line
            System.out.print("\n");
        }

        //print columns (vertiaclly print array)
        System.out.print("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(text[j][i]);
            }
            System.out.print(" ");
        }


    }
}