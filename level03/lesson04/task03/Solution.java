package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg = new Zerg();
        zerg.name = "zerg";

        Zerg zergs = new Zerg();
        zergs.name = "zergs";

        Zerg zergq = new Zerg();
        zergq.name = "zergq";

        Zerg zerge = new Zerg();
        zerge.name = "zerge";

        Zerg zergd = new Zerg();
        zergd.name = "zergd";

        Zerg zergc = new Zerg();
        zergc.name = "zergc";

        Zerg zergg = new Zerg();
        zergg.name = "zergg";

        Zerg zergr = new Zerg();
        zergr.name = "zergr";

        Zerg zergi = new Zerg();
        zergi.name = "zergi";

        Zerg zergn = new Zerg();
        zergn.name = "zergn";

        Protos protos = new Protos();
        protos.name = "protos";

        Protos protosw = new Protos();
        protosw.name = "protosw";

        Protos protosd = new Protos();
        protosd.name = "protos";

        Protos protosv = new Protos();
        protosv.name = "protosn";

        Protos protosn = new Protos();
        protosn.name = "protost";

        Terran terran =new Terran();
        terran.name="terranq";

        Terran terranа =new Terran();
        terran.name="terranq";

        Terran terrans =new Terran();
        terrans.name="terranqs";

        Terran terranm =new Terran();
        terranm.name="terranqm";

        Terran terranu =new Terran();
        terranu.name="terranqu";

        Terran terrank =new Terran();
        terrank.name="terranqk";

        Terran terranl =new Terran();
        terranl.name="terranql";

        Terran terranp =new Terran();
        terranp.name="terranqp";

        Terran terrant =new Terran();
        terrant.name="terranqt";

        Terran terrang =new Terran();
        terrang.name="terranqg";

        Terran terrangg =new Terran();
        terrangg.name="terranqgg";

        Terran terranqq =new Terran();
        terranqq.name="terranqqq";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}