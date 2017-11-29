package lesson9.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MultipleExceptions {

    public void method() throws FileNotFoundException, UnsupportedEncodingException{
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {

        MultipleExceptions me = new MultipleExceptions();

        try {
            me.method();
        }
        catch (IOException e) {
            //do something on ALL IOException
        }

        try {
            me.method();
        } catch (Exception e) {
            //never catch all exceptions if you know which exceptions can occur
        }

        //CORRECT WAY TO HANDLE EXCEPTIONS IF I KNOW WHAT EXCEPTIONS CAN OCCUR
        try {
            me.method();
        } catch (FileNotFoundException e) {
            //do something
        } catch (UnsupportedEncodingException e) {
            //do something
        }

        try {
            me.method();
        } catch (FileNotFoundException e) {
            //do something on FileNotFoundException
        } catch (UnsupportedEncodingException e) {
            //do something on UnsupportedEncodingException
        } catch (IOException e) {
            //do something on ALL IOExceptions
        } catch (Exception e) {
            //do something on ALL Exceptions
        }


        try {
            me.method();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            //do something on FileNotFoundException AND UnsupportedEncodingException
        } catch (IOException e) {
            //do something on ALL IOExceptions
        } catch (Exception e) {
            //do something on ALL Exceptions
        }

    }
}
