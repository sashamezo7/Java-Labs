package isp.lab7.safehome;

public class Door {
        private DoorStatus status;
        public void lockDoor(){
            this.status=DoorStatus.OPEN;
        }
        public void unlockDoor(){
            this.status=DoorStatus.CLOSE;
        }

        public DoorStatus getStatus() {
            return status;
        }

}
