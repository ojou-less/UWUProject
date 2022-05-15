package com.PROG2.Model.PlayerAttachment;


import java.io.*;

/**
    Ist noch ungetestet
    bei weiteren zu speichernden objekten einfach hinzufügen
    und serializable implementieren
 */
public class SaveData implements Serializable {

    public void save(Player player) {
        File file = new File("C:\\spiel\\data.save");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(player);

        } catch (FileNotFoundException notfound) {
            notfound.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public Player load() {
        Player player = null;
        File file = new File("C:\\spiel\\data.save");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            player = (Player) ois.readObject();

        } catch (FileNotFoundException notfound) {
            notfound.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return player;
    }

}
