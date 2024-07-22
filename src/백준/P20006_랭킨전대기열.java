package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P20006_랭킨전대기열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(st.nextToken());
        int maxRoomNum = Integer.parseInt(st.nextToken());

        ManageRoom manageRoom = new ManageRoom(total, maxRoomNum);

        for (int i = 0; i < total; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Member member = new Member(level, name);
            manageRoom.addMember(member);
        }

        sb.append(manageRoom.print());
        System.out.println(sb.toString());
    }
}

class ManageRoom {
    List<Room> rooms;
    int maxRoomNum;

    public ManageRoom(int total, int maxRoomNum) {
        this.maxRoomNum = maxRoomNum;
        rooms = new ArrayList<>();
    }

    public void addMember(Member member) {
        for (Room room : rooms) {
            if (!room.isFull() && room.isLevelCompatible(member.level)) {
                room.addMember(member);
                return;
            }
        }
        Room newRoom = new Room(maxRoomNum, member.level);
        newRoom.addMember(member);
        rooms.add(newRoom);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (Room room : rooms) {
            if (room.isFull()) {
                sb.append("Started!\n");
            } else {
                sb.append("Waiting!\n");
            }
            Collections.sort(room.members, (a, b) -> a.name.compareTo(b.name));
            for (Member member : room.members) {
                sb.append(member.level).append(" ").append(member.name).append("\n");
            }
        }
        return sb.toString();
    }
}

class Room {
    List<Member> members;
    int maxNum;
    int levelLimit;

    public Room(int maxNum, int levelLimit) {
        this.maxNum = maxNum;
        this.levelLimit = levelLimit;
        this.members = new ArrayList<>();
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public boolean isFull() {
        return this.members.size() >= maxNum;
    }

    public boolean isLevelCompatible(int level) {
        return Math.abs(this.levelLimit - level) <= 10;
    }
}

class Member {
    int level;
    String name;

    public Member(int level, String name) {
        this.level = level;
        this.name = name;
    }
}
