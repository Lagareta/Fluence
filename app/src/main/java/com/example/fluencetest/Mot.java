package com.example.fluencetest;

import java.util.ArrayList;
import java.util.Scanner;

public class Mot {


    String word;



    String getword(){
        return word;
    }




    Mot(String wrd){
        this.word = wrd;
    }

    String switch_letter(int niveau){
        int choix_lettre = (int)(Math.random() * word.length());
        char[] name = word.toCharArray();
        char lettre = name[choix_lettre];
        switch (lettre){
            case 'a':
                if (niveau == 1) {
                    char[] tab = {'b','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','f','g','h','j','k','l','m','t','v','w','x','y','z','c','d','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'c','d','i','n','p','q','r','s','u','e','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
            case 'à':
                if (niveau == 1) {
                    char[] tab = {'b','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','f','g','h','j','k','l','m','t','v','w','x','y','z','c','d','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'c','d','i','n','p','q','r','s','u','e','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'b':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','i','k','m','n','o','r','s','u','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','i','k','m','n','o','r','s','u','v','w','x','y','z','f','g','j','l','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'f','g','j','l','t','d','h','p','q'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
            case 'c':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','p','q','t','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','p','q','t','w','x','y','z','a','i','n','r','u','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','i','n','r','u','v','e','o','s'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
            case 'd':
                if (niveau == 1) {
                    char[] tab = {'c','e','i','k','m','n','o','r','s','u','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'c','e','i','k','m','n','o','r','s','u','v','w','x','y','z','a','f','g','j','l','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','f','g','j','l','t','h','p','q'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
            case 'e':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'i','n','p','q','r','s','u','a','c','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'é':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'i','n','p','q','r','s','u','a','c','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'è':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'i','n','p','q','r','s','u','a','c','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'ê':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','j','k','l','m','t','v','w','x','y','z','i','n','p','q','r','s','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'i','n','p','q','r','s','u','a','c','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'f':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','g','k','m','n','o','p','q','s','u','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','g','k','m','n','o','p','q','s','u','v','w','x','y','z','b','d','h','i','j','r'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'b','d','h','i','j','r','l','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'g':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','f','i','k','l','m','n','r','s','t','u','v','w','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','f','i','k','l','m','n','r','s','t','u','v','w','x','z','b','d','h','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'b','d','h','o','j','p','q','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'h':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','i','k','l','m','n','r','s','t','u','v','w','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','i','k','l','m','n','r','s','t','u','v','w','x','z','f','g','i','k','m','p','r','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'f','g','i','k','m','p','r','t','b','d','l','n'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'i':
                if (niveau == 1) {
                    char[] tab = {'b','d','g','k','m','n','p','q','t','u','v','w','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','g','k','m','n','p','q','t','u','v','w','x','z','a','c','e','f','h'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','c','e','f','h','j','l','r'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'j':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','h','k','m','n','p','q','s','u','v','w','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','h','k','m','n','p','q','s','u','v','w','x','z','b','d','f','l','p','q','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'b','d','f','l','p','q','y','g','i'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'k':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','g','i','j'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','g','i','j','h','l','r','t','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'h','l','r','t','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'l':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','g','m','n','o','p','q','r','s','u','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','g','m','n','o','p','q','r','s','u','v','w','x','y','z','b','d','j','k'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'b','d','j','k','f','h','i','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'm':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','g','i','j','k','l'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','g','i','j','k','l','h','p','q','r','t','u','v','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'h','p','q','r','t','u','v','x','y','z','n','w'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'n':
                if (niveau == 1) {
                    char[] tab = {'b','d','k','g','i','j','k','l','p','q','s','t','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','k','g','i','j','k','l','p','q','s','t','w','x','y','z','a','c','e','o','r','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','c','e','o','r','v','h','m','w'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'o':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','h','j','k','l','m','r','t','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','h','j','k','l','m','r','t','w','x','y','z','g','i','n','p','q','s','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'g','i','n','p','q','s','v','a','c','e','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'ô':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','h','j','k','l','m','r','t','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','h','j','k','l','m','r','t','w','x','y','z','g','i','n','p','q','s','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'g','i','n','p','q','s','v','a','c','e','u'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }


            case 'p':
                if (niveau == 1) {
                    char[] tab = {'c','f','i','k','l','m','n','s','u','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'c','f','i','k','l','m','n','s','u','w','x','y','z','a','e','h','j','o','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','e','h','j','o','y','b','d','f','q'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }


            case 'q':
                if (niveau == 1) {
                    char[] tab = {'c','f','h','i','k','l','m','n','r','s','t','u','v','w','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'c','f','h','i','k','l','m','n','r','s','t','u','v','w','x','z','a','e','j','o'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','e','j','o','b','d','g','p','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'r':
                if (niveau == 1) {
                    char[] tab = {'b','d','g','j','l','o','p','q','t','u','v','w','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','g','j','l','o','p','q','t','u','v','w','y','z','a','c','e','f','h','k','m','n','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','c','e','f','h','k','m','n','x','s','i'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 's':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','i','j','k','l','m','n','p','q','t','u','v','w','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','i','j','k','l','m','n','p','q','t','u','v','w','y','a','e','o','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','e','o','x','r','c'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 't':
                if (niveau == 1) {
                    char[] tab = {'a','c','e','g','j','m','n','o','p','q','r','s','u','v','w','x','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','c','e','g','j','m','n','o','p','q','r','s','u','v','w','x','y','z','b','d','h','i','k'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'b','d','h','i','k','f','l'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'u':
                if (niveau == 1) {
                    char[] tab = {'b','d','f','g','h','i','j','k','l','p','q','r','s','t','x','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'b','d','f','g','h','i','j','k','l','p','q','r','s','t','x','z','a','c','e','m','w','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'a','c','e','m','w','y','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'v':
                if (niveau == 1) {
                    char[] tab = {'a','b','d','e','f','g','h','i','j','k','l','m','p','q','r','s','t'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','d','e','f','g','h','i','j','k','l','m','p','q','r','s','t','c','n','o','z','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'c','n','o','z','x','w','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'w':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','r','s','t','y','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','n','o','p','q','r','s','t','y','z','u','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'u','x','v','m'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'x':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','t','u','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','t','u','z','k','r','s','v','w'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'k','r','s','v','w'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'y':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','h','k','l','m','n','o','r','s','y','w','z'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','h','k','l','m','n','o','r','s','y','w','z','i','j','p','u','x'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'i','j','p','u','x','g','v','q'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }

            case 'z':
                if (niveau == 1) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','w','x','y'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
                else if(niveau == 2) {
                    char[] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','w','x','y','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;
                }
                else {
                    char[] tab = {'s','v'};
                    int n = tab.length;
                    int let_change = (int)(Math.random() * n);
                    name[choix_lettre] = tab[let_change];
                    String ret = new String(name);
                    return ret;

                }
            default:
                return "gne";
        }
    }


    static ArrayList<Mot> get_liste(int niveau){
        ArrayList<Mot> liste = new ArrayList<Mot>();
        if (niveau==1) {
            liste.add(new Mot("à"));
            liste.add(new Mot("aile"));
            liste.add(new Mot("aimer"));
            liste.add(new Mot("air"));
            liste.add(new Mot("ami"));
            liste.add(new Mot("animal"));
            liste.add(new Mot("animaux"));
            liste.add(new Mot("arbre"));
            liste.add(new Mot("avoir"));
            liste.add(new Mot("beau"));
            liste.add(new Mot("belle"));
            liste.add(new Mot("beaucoup"));
            liste.add(new Mot("bébé"));
            liste.add(new Mot("blanc"));
            liste.add(new Mot("bleu"));
            liste.add(new Mot("bon"));
            liste.add(new Mot("bonbon"));
            liste.add(new Mot("bouche"));
            liste.add(new Mot("bras")) ;
            liste.add(new Mot("brun"));
            liste.add(new Mot("carte"));
            liste.add(new Mot("chambre"));
            liste.add(new Mot("chanter"));
            liste.add(new Mot("chapeau"));
            liste.add(new Mot("chat"));
            liste.add(new Mot("chaud"));
            liste.add(new Mot("chemin"));
            liste.add(new Mot("cher"));
            liste.add(new Mot("chercher"));
            liste.add(new Mot("cheval"));
            liste.add(new Mot("chevaux"));
            liste.add(new Mot("cheveu"));
            liste.add(new Mot("chien"));
            liste.add(new Mot("chose"));
            liste.add(new Mot("ciel"));
            liste.add(new Mot("amie"));
            liste.add(new Mot("cinq"));
            liste.add(new Mot("classe"));
            liste.add(new Mot("cœur"));
            liste.add(new Mot("cou"));
            liste.add(new Mot("coup"));
            liste.add(new Mot("dame"));
            liste.add(new Mot("dans"));
            liste.add(new Mot("de"));
            liste.add(new Mot("demander"));
            liste.add(new Mot("dent")) ;
            liste.add(new Mot("deux"));
            liste.add(new Mot("devenir"));
            liste.add(new Mot("devoir")) ;
            liste.add(new Mot("dimanche"));
            liste.add(new Mot("dix")) ;
            liste.add(new Mot("donner"));
            liste.add(new Mot("dormir")) ;
            liste.add(new Mot("doux"));
            liste.add(new Mot("du"));
            liste.add(new Mot("eau"));
            liste.add(new Mot("école"));
            liste.add(new Mot("enfant"));
            liste.add(new Mot("et"));
            liste.add(new Mot("être"));
            liste.add(new Mot("fenêtre"));
            liste.add(new Mot("famille")) ;
            liste.add(new Mot("fête")) ;
            liste.add(new Mot("feu")) ;
            liste.add(new Mot("feuille"));
            liste.add(new Mot("fille")) ;
            liste.add(new Mot("finir")) ;
            liste.add(new Mot("fleur")) ;
            liste.add(new Mot("fois")) ;
            liste.add(new Mot("forêt"));
            liste.add(new Mot("frère"));
            liste.add(new Mot("garçon"));
            liste.add(new Mot("grand")) ;
            liste.add(new Mot("gris")) ;
            liste.add(new Mot("gros")) ;
            liste.add(new Mot("heure"));
            liste.add(new Mot("heureux"));
            liste.add(new Mot("histoire")) ;
            liste.add(new Mot("huit")) ;
            liste.add(new Mot("il")) ;
            liste.add(new Mot("elle"));
            liste.add(new Mot("jardin"));
            liste.add(new Mot("jaune"));
            liste.add(new Mot("je"));
            liste.add(new Mot("jeu"));
            liste.add(new Mot("jeudi"));
            liste.add(new Mot("joie"));
            liste.add(new Mot("joli"));
            liste.add(new Mot("jouer"));
            liste.add(new Mot("jour"));
            liste.add(new Mot("journée"));
            liste.add(new Mot("lapin"));
            liste.add(new Mot("le"));
            liste.add(new Mot("la"));
            liste.add(new Mot("les"));
            liste.add(new Mot("lettre"));
            liste.add(new Mot("lever"));
            liste.add(new Mot("lire"));
            liste.add(new Mot("lit"));
            liste.add(new Mot("livre"));
            liste.add(new Mot("long"));
            liste.add(new Mot("loup"));
            liste.add(new Mot("louve"));
            liste.add(new Mot("lundi"));
            liste.add(new Mot("lune"));
            liste.add(new Mot("main"));
            liste.add(new Mot("mais")) ;
            liste.add(new Mot("maison"));
            liste.add(new Mot("maman")) ;
            liste.add(new Mot("manger")) ;
            liste.add(new Mot("marche")) ;
            liste.add(new Mot("mardi")) ;
            liste.add(new Mot("matin")) ;
            liste.add(new Mot("merci")) ;
            liste.add(new Mot("mercredi"));
            liste.add(new Mot("mère")) ;
            liste.add(new Mot("midi")) ;
            liste.add(new Mot("mon"));
            liste.add(new Mot("ma")) ;
            liste.add(new Mot("mes"));
            liste.add(new Mot("monde"));
            liste.add(new Mot("montagne"));
            liste.add(new Mot("mot")) ;
            liste.add(new Mot("mouton"));
            liste.add(new Mot("musique"));
            liste.add(new Mot("neige")) ;
            liste.add(new Mot("neuf")) ;
            liste.add(new Mot("nez")) ;
            liste.add(new Mot("noir")) ;
            liste.add(new Mot("nom")) ;
            liste.add(new Mot("nous")) ;
            liste.add(new Mot("nuit")) ;
            liste.add(new Mot("oeil")) ;
            liste.add(new Mot("yeux"));
            liste.add(new Mot("oeuf")) ;
            liste.add(new Mot("oiseau"));
            liste.add(new Mot("on")) ;
            liste.add(new Mot("oreille"));
            liste.add(new Mot("ou")) ;
            liste.add(new Mot("ouvrir"));
            liste.add(new Mot("page")) ;
            liste.add(new Mot("pain")) ;
            liste.add(new Mot("papa")) ;
            liste.add(new Mot("papier"));
            liste.add(new Mot("parler"));
            liste.add(new Mot("pauvre"));
            liste.add(new Mot("pays"));
            liste.add(new Mot("père"));
            liste.add(new Mot("personne"));
            liste.add(new Mot("petit"));
            liste.add(new Mot("phrase"));
            liste.add(new Mot("pied"));
            liste.add(new Mot("place"));
            liste.add(new Mot("plaisir"));
            liste.add(new Mot("plein")) ;
            liste.add(new Mot("pluie")) ;
            liste.add(new Mot("plus")) ;
            liste.add(new Mot("poisson"));
            liste.add(new Mot("pomme"));
            liste.add(new Mot("porte")) ;
            liste.add(new Mot("poule")) ;
            liste.add(new Mot("poupée"));
            liste.add(new Mot("pouvoir"));
            liste.add(new Mot("premier")) ;
            liste.add(new Mot("quand")) ;
            liste.add(new Mot("quatre")) ;
            liste.add(new Mot("queue"));
            liste.add(new Mot("qui"));
            liste.add(new Mot("regarder"));
            liste.add(new Mot("robe"));
            liste.add(new Mot("roi"));
            liste.add(new Mot("rose"));
            liste.add(new Mot("rouge"));
            liste.add(new Mot("route"));
            liste.add(new Mot("rue"));
            liste.add(new Mot("sac"));
            liste.add(new Mot("samedi"));
            liste.add(new Mot("sept"));
            liste.add(new Mot("six")) ;
            liste.add(new Mot("sœur"));
            liste.add(new Mot("soir")) ;
            liste.add(new Mot("soleil"));
            liste.add(new Mot("son")) ;
            liste.add(new Mot("sa"));
            liste.add(new Mot("ses"));
            liste.add(new Mot("souris"));
            liste.add(new Mot("table"));
            liste.add(new Mot("terre"));
            liste.add(new Mot("tête"));
            liste.add(new Mot("ton"));
            liste.add(new Mot("ta"));
            liste.add(new Mot("tes")) ;
            liste.add(new Mot("train"));
            liste.add(new Mot("trois")) ;
            liste.add(new Mot("tu")) ;
            liste.add(new Mot("un")) ;
            liste.add(new Mot("une"));
            liste.add(new Mot("des")) ;
            liste.add(new Mot("vélo")) ;
            liste.add(new Mot("vendredi"));
            liste.add(new Mot("vent"));
            liste.add(new Mot("vert"));
            liste.add(new Mot("vie"));
            liste.add(new Mot("ville"));
            liste.add(new Mot("visage"));
            liste.add(new Mot("voir"));
            liste.add(new Mot("voler"));
            liste.add(new Mot("vouloir"));
            liste.add(new Mot("vous"));
        }
        else if(niveau == 2) {
            liste.add(new Mot("abri"));
            liste.add(new Mot("acheter")) ;
            liste.add(new Mot("adulte")) ;
            liste.add(new Mot("affaire")) ;
            liste.add(new Mot("âge")) ;
            liste.add(new Mot("agneau")) ;
            liste.add(new Mot("aider")) ;
            liste.add(new Mot("allure")) ;
            liste.add(new Mot("alphabet")) ;
            liste.add(new Mot("amour")) ;
            liste.add(new Mot("ampoule")) ;
            liste.add(new Mot("année")) ;
            liste.add(new Mot("août")) ;
            liste.add(new Mot("appartement"));
            liste.add(new Mot("apporter")) ;
            liste.add(new Mot("apprendre")) ;
            liste.add(new Mot("approcher")) ;
            liste.add(new Mot("argent")) ;
            liste.add(new Mot("assez")) ;
            liste.add(new Mot("attention"));
            liste.add(new Mot("attraper")) ;
            liste.add(new Mot("aussitôt"));
            liste.add(new Mot("autobus")) ;
            liste.add(new Mot("avaler"));
            liste.add(new Mot("avancer"));
            liste.add(new Mot("avion")) ;
            liste.add(new Mot("avril")) ;
            liste.add(new Mot("baigner"));
            liste.add(new Mot("bain")) ;
            liste.add(new Mot("balle")) ;
            liste.add(new Mot("ballon"));
            liste.add(new Mot("bande")) ;
            liste.add(new Mot("barbe")) ;
            liste.add(new Mot("bas")) ;
            liste.add(new Mot("bateau"));
            liste.add(new Mot("bâton")) ;
            liste.add(new Mot("battre")) ;
            liste.add(new Mot("bête")) ;
            liste.add(new Mot("bien")) ;
            liste.add(new Mot("bientôt"));
            liste.add(new Mot("boire")) ;
            liste.add(new Mot("boîte")) ;
            liste.add(new Mot("bonheur"));
            liste.add(new Mot("bonhomme"));
            liste.add(new Mot("bonjour")) ;
            liste.add(new Mot("bonsoir")) ;
            liste.add(new Mot("bord")) ;
            liste.add(new Mot("botte")) ;
            liste.add(new Mot("bouchon"));
            liste.add(new Mot("bouteille"));
            liste.add(new Mot("branche")) ;
            liste.add(new Mot("brutal")) ;
            liste.add(new Mot("bureau")) ;
            liste.add(new Mot("but"));
            liste.add(new Mot("cacher"));
            liste.add(new Mot("cadeau")) ;
            liste.add(new Mot("camion")) ;
            liste.add(new Mot("car")) ;
            liste.add(new Mot("cause"));
            liste.add(new Mot("certain"));
            liste.add(new Mot("chacun")) ;
            liste.add(new Mot("chagrin")) ;
            liste.add(new Mot("chaise"));
            liste.add(new Mot("champ")) ;
            liste.add(new Mot("changer"));
            liste.add(new Mot("chant"));
            liste.add(new Mot("chasse"));
            liste.add(new Mot("chasser"));
            liste.add(new Mot("chasseur"));
            liste.add(new Mot("château")) ;
            liste.add(new Mot("chiffre")) ;
            liste.add(new Mot("choisir"));
            liste.add(new Mot("choix")) ;
            liste.add(new Mot("cinéma")) ;
            liste.add(new Mot("clair")) ;
            liste.add(new Mot("clé")) ;
            liste.add(new Mot("coin")) ;
            liste.add(new Mot("combien"));
            liste.add(new Mot("commencer"));
            liste.add(new Mot("comprendre"));
            liste.add(new Mot("compter")) ;
            liste.add(new Mot("congé")) ;
            liste.add(new Mot("consoler"));
            liste.add(new Mot("conte")) ;
            liste.add(new Mot("continuer"));
            liste.add(new Mot("contre")) ;
            liste.add(new Mot("corps")) ;
            liste.add(new Mot("costume"));
            liste.add(new Mot("coucher")) ;
            liste.add(new Mot("couleur")) ;
            liste.add(new Mot("courant"));
            liste.add(new Mot("courir")) ;
            liste.add(new Mot("cours")) ;
            liste.add(new Mot("course")) ;
            liste.add(new Mot("court")) ;
            liste.add(new Mot("crème"));
            liste.add(new Mot("cri")) ;
            liste.add(new Mot("crier"));
            liste.add(new Mot("crise")) ;
            liste.add(new Mot("croire")) ;
            liste.add(new Mot("cuisine")) ;
            liste.add(new Mot("danger"));
            liste.add(new Mot("danse")) ;
            liste.add(new Mot("danser"));
            liste.add(new Mot("date"));
            liste.add(new Mot("décembre"));
            liste.add(new Mot("découvrir"));
            liste.add(new Mot("dedans")) ;
            liste.add(new Mot("dehors"));
            liste.add(new Mot("demain")) ;
            liste.add(new Mot("demande")) ;
            liste.add(new Mot("demi")) ;
            liste.add(new Mot("déposer"));
            liste.add(new Mot("descendre"));
            liste.add(new Mot("diriger"));
            liste.add(new Mot("docteur"));
            liste.add(new Mot("doigt")) ;
            liste.add(new Mot("dos")) ;
            liste.add(new Mot("droit"));
            liste.add(new Mot("droite"));
            liste.add(new Mot("dur")) ;
            liste.add(new Mot("écouter"));
            liste.add(new Mot("écrire"));
            liste.add(new Mot("église"));
            liste.add(new Mot("embrasser"));
            liste.add(new Mot("enquête")) ;
            liste.add(new Mot("ensemble")) ;
            liste.add(new Mot("entrer"));
            liste.add(new Mot("environ"));
            liste.add(new Mot("épais")) ;
            liste.add(new Mot("espérer"));
            liste.add(new Mot("étoile")) ;
            liste.add(new Mot("exemple")) ;
            liste.add(new Mot("facile")) ;
            liste.add(new Mot("faim")) ;
            liste.add(new Mot("faute"));
            liste.add(new Mot("fer")) ;
            liste.add(new Mot("ferme"));
            liste.add(new Mot("fermer"));
            liste.add(new Mot("février"));
            liste.add(new Mot("fier"));
            liste.add(new Mot("fil")) ;
            liste.add(new Mot("film")) ;
            liste.add(new Mot("fixe")) ;
            liste.add(new Mot("fleuve"));
            liste.add(new Mot("fond")) ;
            liste.add(new Mot("fou")) ;
            liste.add(new Mot("folle"));
            liste.add(new Mot("frais")) ;
            liste.add(new Mot("fraîche"));
            liste.add(new Mot("fraise")) ;
            liste.add(new Mot("frapper")) ;
            liste.add(new Mot("gagner")) ;
            liste.add(new Mot("garder")) ;
            liste.add(new Mot("gauche"));
            liste.add(new Mot("genou")) ;
            liste.add(new Mot("genre")) ;
            liste.add(new Mot("gens"));
            liste.add(new Mot("gentil"));
            liste.add(new Mot("glace")) ;
            liste.add(new Mot("glisser"));
            liste.add(new Mot("gorge")) ;
            liste.add(new Mot("goutte")) ;
            liste.add(new Mot("groupe"));
            liste.add(new Mot("guerre"));
            liste.add(new Mot("habiter"));
            liste.add(new Mot("haut")) ;
            liste.add(new Mot("hauteur"));
            liste.add(new Mot("herbe")) ;
            liste.add(new Mot("hôpital")) ;
            liste.add(new Mot("horrible"));
            liste.add(new Mot("important"));
            liste.add(new Mot("invitation"));
            liste.add(new Mot("jambe")) ;
            liste.add(new Mot("janvier"));
            liste.add(new Mot("jeter")) ;
            liste.add(new Mot("jeune")) ;
            liste.add(new Mot("joue")) ;
            liste.add(new Mot("jouet")) ;
            liste.add(new Mot("journal"));
            liste.add(new Mot("juillet"));
            liste.add(new Mot("juin")) ;
            liste.add(new Mot("jus")) ;
            liste.add(new Mot("juste"));
            liste.add(new Mot("laisser"));
            liste.add(new Mot("lancer"));
            liste.add(new Mot("langue")) ;
            liste.add(new Mot("lendemain"));
            liste.add(new Mot("lentement")) ;
            liste.add(new Mot("lèvre")) ;
            liste.add(new Mot("libre")) ;
            liste.add(new Mot("lieu")) ;
            liste.add(new Mot("lièvre"));
            liste.add(new Mot("ligne")) ;
            liste.add(new Mot("lion")) ;
            liste.add(new Mot("longtemps"));
            liste.add(new Mot("lumière")) ;
            liste.add(new Mot("machine")) ;
            liste.add(new Mot("magasin"));
            liste.add(new Mot("mai")) ;
            liste.add(new Mot("mal")) ;
            liste.add(new Mot("maladie"));
            liste.add(new Mot("malheur")) ;
            liste.add(new Mot("manquer"));
            liste.add(new Mot("marché"));
            liste.add(new Mot("marcher"));
            liste.add(new Mot("mari"));
            liste.add(new Mot("mars"));
            liste.add(new Mot("mauvais"));
            liste.add(new Mot("méchant")) ;
            liste.add(new Mot("meilleur")) ;
            liste.add(new Mot("ménage")) ;
            liste.add(new Mot("mener")) ;
            liste.add(new Mot("mer")) ;
            liste.add(new Mot("métal"));
            liste.add(new Mot("métier"));
            liste.add(new Mot("mètre")) ;
            liste.add(new Mot("milieu")) ;
            liste.add(new Mot("millier")) ;
            liste.add(new Mot("million")) ;
            liste.add(new Mot("mine")) ;
            liste.add(new Mot("minuit"));
            liste.add(new Mot("minute")) ;
            liste.add(new Mot("mois")) ;
            liste.add(new Mot("moitié"));
            liste.add(new Mot("montrer"));
            liste.add(new Mot("morceau")) ;
            liste.add(new Mot("mort")) ;
            liste.add(new Mot("mourir"));
            liste.add(new Mot("moyen"));
            liste.add(new Mot("mur"));
            liste.add(new Mot("murmure"));
            liste.add(new Mot("museau"));
            liste.add(new Mot("naissance"));
            liste.add(new Mot("neuve")) ;
            liste.add(new Mot("nid")) ;
            liste.add(new Mot("nombre"));
            liste.add(new Mot("nourrir"));
            liste.add(new Mot("nourriture"));
            liste.add(new Mot("novembre")) ;
            liste.add(new Mot("nuage")) ;
            liste.add(new Mot("occuper"));
            liste.add(new Mot("octobre")) ;
            liste.add(new Mot("offrir")) ;
            liste.add(new Mot("ombre")) ;
            liste.add(new Mot("or")) ;
            liste.add(new Mot("oublier"));
            liste.add(new Mot("ours")) ;
            liste.add(new Mot("ouvert"));
            liste.add(new Mot("pâle")) ;
            liste.add(new Mot("pantalon"));
            liste.add(new Mot("paraître")) ;
            liste.add(new Mot("parc"));
            liste.add(new Mot("part"));
            liste.add(new Mot("partie"));
            liste.add(new Mot("passage")) ;
            liste.add(new Mot("patin")) ;
            liste.add(new Mot("payer"));
            liste.add(new Mot("pencher"));
            liste.add(new Mot("perdre")) ;
            liste.add(new Mot("permettre"));
            liste.add(new Mot("photo")) ;
            liste.add(new Mot("pièce"));
            liste.add(new Mot("pierre"));
            liste.add(new Mot("pile")) ;
            liste.add(new Mot("pin")) ;
            liste.add(new Mot("plan")) ;
            liste.add(new Mot("plastique"));
            liste.add(new Mot("pleuvoir")) ;
            liste.add(new Mot("plusieurs")) ;
            liste.add(new Mot("poche")) ;
            liste.add(new Mot("poids")) ;
            liste.add(new Mot("poli"));
            liste.add(new Mot("poil"));
            liste.add(new Mot("point"));
            liste.add(new Mot("porter")) ;
            liste.add(new Mot("poser")) ;
            liste.add(new Mot("posséder"));
            liste.add(new Mot("possible"));
            liste.add(new Mot("pot")) ;
            liste.add(new Mot("poudre"));
            liste.add(new Mot("pousser"));
            liste.add(new Mot("poussin"));
            liste.add(new Mot("précipiter"));
            liste.add(new Mot("préférer")) ;
            liste.add(new Mot("préparer")) ;
            liste.add(new Mot("présenter"));
            liste.add(new Mot("presque")) ;
            liste.add(new Mot("prix")) ;
            liste.add(new Mot("prochain"));
            liste.add(new Mot("professeur"));
            liste.add(new Mot("promener"));
            liste.add(new Mot("promettre"));
            liste.add(new Mot("protéger")) ;
            liste.add(new Mot("quel")) ;
            liste.add(new Mot("question"));
            liste.add(new Mot("raconter")) ;
            liste.add(new Mot("radio")) ;
            liste.add(new Mot("rappeler"));
            liste.add(new Mot("rat")) ;
            liste.add(new Mot("rate")) ;
            liste.add(new Mot("rayon")) ;
            liste.add(new Mot("réaction"));
            liste.add(new Mot("recevoir")) ;
            liste.add(new Mot("recherche")) ;
            liste.add(new Mot("rejoindre")) ;
            liste.add(new Mot("remarquer")) ;
            liste.add(new Mot("remettre")) ;
            liste.add(new Mot("remonter")) ;
            liste.add(new Mot("remplir")) ;
            liste.add(new Mot("renard")) ;
            liste.add(new Mot("rencontrer"));
            liste.add(new Mot("rendre")) ;
            liste.add(new Mot("repas")) ;
            liste.add(new Mot("reprendre"));
            liste.add(new Mot("restaurant"));
            liste.add(new Mot("retard")) ;
            liste.add(new Mot("retenir")) ;
            liste.add(new Mot("retourner"));
            liste.add(new Mot("retrouver"));
            liste.add(new Mot("réveiller")) ;
            liste.add(new Mot("revenir")) ;
            liste.add(new Mot("réussir")) ;
            liste.add(new Mot("rêver")) ;
            liste.add(new Mot("riche")) ;
            liste.add(new Mot("rien")) ;
            liste.add(new Mot("rire")) ;
            liste.add(new Mot("rivière"));
            liste.add(new Mot("rond")) ;
            liste.add(new Mot("ronde")) ;
            liste.add(new Mot("rouler")) ;
            liste.add(new Mot("ruisseau"));
            liste.add(new Mot("sabot"));
            liste.add(new Mot("saison"));
            liste.add(new Mot("salle"));
            liste.add(new Mot("salut"));
            liste.add(new Mot("santé"));
            liste.add(new Mot("sapin")) ;
            liste.add(new Mot("sauver"));
            liste.add(new Mot("sec")) ;
            liste.add(new Mot("sèche"));
            liste.add(new Mot("secouer"));
            liste.add(new Mot("sembler"));
            liste.add(new Mot("sentier"));
            liste.add(new Mot("sentir"));
            liste.add(new Mot("septembre"));
            liste.add(new Mot("service"));
            liste.add(new Mot("servir"));
            liste.add(new Mot("soie")) ;
            liste.add(new Mot("soigner"));
            liste.add(new Mot("soin")) ;
            liste.add(new Mot("soirée"));
            liste.add(new Mot("son")) ;
            liste.add(new Mot("sorte"));
            liste.add(new Mot("souhaiter"));
            liste.add(new Mot("soulier"));
            liste.add(new Mot("souper")) ;
            liste.add(new Mot("sourcil"));
            liste.add(new Mot("souvenir"));
            liste.add(new Mot("spectacle"));
            liste.add(new Mot("sucre"));
            liste.add(new Mot("suite"));
            liste.add(new Mot("sujet"));
            liste.add(new Mot("surface"));
            liste.add(new Mot("taille")) ;
            liste.add(new Mot("téléphone"));
            liste.add(new Mot("télévision"));
            liste.add(new Mot("terminer")) ;
            liste.add(new Mot("terrain")) ;
            liste.add(new Mot("timide"));
            liste.add(new Mot("tirer")) ;
            liste.add(new Mot("toucher"));
            liste.add(new Mot("tour")) ;
            liste.add(new Mot("tranquille"));
            liste.add(new Mot("travailler"));
            liste.add(new Mot("trésor"));
            liste.add(new Mot("triste"));
            liste.add(new Mot("troisième"));
            liste.add(new Mot("trottoir")) ;
            liste.add(new Mot("trou")) ;
            liste.add(new Mot("tuer"));
            liste.add(new Mot("usine"));
            liste.add(new Mot("vacances"));
            liste.add(new Mot("valoir"));
            liste.add(new Mot("ventre")) ;
            liste.add(new Mot("verre"));
            liste.add(new Mot("verser"));
            liste.add(new Mot("vêtement"));
            liste.add(new Mot("viande")) ;
            liste.add(new Mot("village")) ;
            liste.add(new Mot("vinaigre")) ;
            liste.add(new Mot("visite"));
            liste.add(new Mot("vitesse"));
            liste.add(new Mot("vivre"));
            liste.add(new Mot("voisin"));
            liste.add(new Mot("voiture"));
            liste.add(new Mot("voyage")) ;
            liste.add(new Mot("vue")) ;
            liste.add(new Mot("zoo")) ;
            liste.add(new Mot("mille"));
        }



        return liste;
    }

    boolean test(String str){
        boolean same;
        if (getword().equals(str)){
            return true;
        }
        else{
            return false;
        }
    }



    boolean game(boolean test, boolean choix) {
        if(test==choix) {
            return true;
        }
        else {
            return false;
        }

    }
}

