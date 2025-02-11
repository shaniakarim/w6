package main;

private static void listVehicles(){if(vehicles.isEmpty()){System.out.println("No vehicles available.");}else{for(int i=0;i<vehicles.size();i++){Vehicle v=vehicles.get(i);System.out.println(v.getType()+": "+v.getManufacturer()+" "+v.getModel());System.out.println("Max Speed: "+v.getMaxSpeed()+" km/h");System.out.println("Engine: "+v.getEngine());

if(i<vehicles.size()-1){ // Ensures no extra blank line at the end
System.out.println();}}}}
