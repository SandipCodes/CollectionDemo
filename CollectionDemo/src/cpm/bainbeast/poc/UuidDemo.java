package cpm.bainbeast.poc;

import java.util.UUID;

public class UuidDemo {

	public static void main(String[] args) {
		
		UUID uuid=UUID.randomUUID();
		
		System.out.println(uuid);
		
		 // 4. Access individual components of a UUID
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int version = uuid.version();
        int variant = uuid.variant();


        System.out.println("mostSignificantBits: "+ mostSignificantBits);
        System.out.println("leastSignificantBits: "+ leastSignificantBits);
        System.out.println("version: "+ version);
        System.out.println("variant : "+ variant);

	
         //comparing two UUID's
        
        UUID uuidSecond=  UUID.randomUUID();
        
        if(uuid.equals(uuidSecond)) {
        	System.out.println("Both are equal: "+ uuid +"  "+ uuidSecond );
        }
        else {
        	System.out.println("Both arenot equal: "+ uuid +"  "+ uuidSecond );
        }
	}//main()

}//class
