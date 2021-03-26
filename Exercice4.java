
//  Saisir une date puis determiner la date suivante puis la date precedente 
//  1- pas de classe de java 
//  2- Faire avec les classes Java 

// pas de classe de java 
Calendar cal2 = Calendar.getInstance(); 
cal2.add(Calendar.YEAR, -1); 
Date dt2 = new Date(cal2.getTimeInMillis()); 
System.out.println(dt2); 

// Faire avec les classes Java 