package com.bl.baseball_stats.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Player {
    @Id
    @Column(name = "player", unique = true)
    private String name;

    private String team;
    private String pos;
    private int age;
    private int g;
    private int ab;
    private int r;
    private int h;
    private int db;
    private int triple;
    private int hr;
    private int rbi;
    private int sb;
    private int cs;
    private int bb;
    private int so;
    private int sh;
    private int sf;
    private int hbp;
    private float avg;
    private float obp;
    private float slg;
    private float ops;

    public Player() {
    }

    public Player(String name, String team, String pos, int age, int g, int ab, int r, int h, int db, int triple, int hr, int rbi, int sb, int cs, int bb, int so, int sh, int sf, int hbp, float avg, float obp, float slg, float ops) {
        this.name = name;
        this.team = team;
        this.pos = pos;
        this.age = age;
        this.g = g;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this.db = db;
        this.triple = triple;
        this.hr = hr;
        this.rbi = rbi;
        this.sb = sb;
        this.cs = cs;
        this.bb = bb;
        this.so = so;
        this.sh = sh;
        this.sf = sf;
        this.hbp = hbp;
        this.avg = avg;
        this.obp = obp;
        this.slg = slg;
        this.ops = ops;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPos() {
        return pos;
    }

    public int getAge() {
        return age;
    }

    public int getG() {
        return g;
    }

    public int getAb() {
        return ab;
    }

    public int getR() {
        return r;
    }

    public int getH() {
        return h;
    }

    public int getDb() {
        return db;
    }

    public int getTriple() {
        return triple;
    }

    public int getHr() {
        return hr;
    }

    public int getRbi() {
        return rbi;
    }

    public int getSb() {
        return sb;
    }

    public int getCs() {
        return cs;
    }

    public int getBb() {
        return bb;
    }

    public int getSo() {
        return so;
    }

    public int getSh() {
        return sh;
    }

    public int getSf() {
        return sf;
    }

    public int getHbp() {
        return hbp;
    }

    public float getAvg() {
        return avg;
    }

    public float getObp() {
        return obp;
    }

    public float getSlg() {
        return slg;
    }

    public float getOps() {
        return ops;
    }

    public void setName(String player) {
        this.name = player;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public void setTriple(int triple) {
        this.triple = triple;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public void setSh(int sh) {
        this.sh = sh;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public void setHbp(int hbp) {
        this.hbp = hbp;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public void setObp(float obp) {
        this.obp = obp;
    }

    public void setSlg(float slg) {
        this.slg = slg;
    }

    public void setOps(float ops) {
        this.ops = ops;
    }
}
