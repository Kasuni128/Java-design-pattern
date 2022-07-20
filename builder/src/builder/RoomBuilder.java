package builder;

public class RoomBuilder {

	private final int roomid;
	private final String roomtype;
	private final String roomstatus;
	private final int roomrate;
	

	public RoomBuilder(Builder builder) {
		
		this.roomid = builder.roomid;
		this.roomtype = builder.roomtype;
		this.roomstatus = builder.roomstatus;
		this.roomrate = builder.roomrate;
	}


	public int getRoomid() {
		return roomid;
	}


	public String getRoomtype() {
		return roomtype;
	}


	public String getRoomstatus() {
		return roomstatus;
	}


	public int getRoomrate() {
		return roomrate;
	}


	@Override
	public String toString() {
		return "RoomBuilder {"  +
				"roomid=" + roomid +
				", roomtype=" + roomtype + 
				", roomstatus=" + roomstatus + 
				", roomrate=" + roomrate + "}";
	}
	
	
	static class Builder{

        private int roomid;
        private String roomtype;
        private String roomstatus;
        private int roomrate;

        public RoomBuilder build(){
        	RoomBuilder room=new RoomBuilder(this);
            return room;

        }

        public Builder(int roomid,String roomtype){

            this.roomid=roomid;
            this.roomtype=roomtype;
        }

        public void setRoomid(int roomid) {
            this.roomid = roomid;
        }

        public void setRoomtype(String roomtype) {
            this.roomtype = roomtype;
        }

        public void setRoomstatus(String roomstatus) {
            this.roomstatus = roomstatus;
        }

        public void setRoomrate(int roomrate) {
            this.roomrate = roomrate;
        }
    }

	
	

}
