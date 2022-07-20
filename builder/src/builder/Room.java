package builder;

public class Room {
	 public static void main(String[] args) {
	        RoomBuilder.Builder builder=new  RoomBuilder.Builder(1001,"Single");
	        builder.setRoomstatus("Busy"); builder.setRoomrate(20000);
	        RoomBuilder room= builder.build();
	        System.out.println(room);
	    }
	
	
}



