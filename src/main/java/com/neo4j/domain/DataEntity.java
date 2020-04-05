package com.neo4j.domain;

/**
 * @Authror SPL
 * @Description TODO
 * @Date 2020/2/15
 */

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
//import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Author: 梨花
 * @Description:
 * @Date: 2020/1/30 19:13
 * @Modeified By:
 */
@NodeEntity(label = "mydata")
public class DataEntity {
    @Id
    @GeneratedValue
    private  Long id;
    private String   name;
    private double   保定市;
    private double   衡水市;
    private double   张家口市;
    private double   承德市;
    private double   沧州市;
    private double   邯郸市;
    private double   秦皇岛市;
    private double   石家庄市;
    private double   唐山市;
    private double   邢台市;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double get保定市() {
        return 保定市;
    }

    public void set保定市(double 保定市) {
        this.保定市 = 保定市;
    }

    public double get衡水市() {
        return 衡水市;
    }

    public void set衡水市(double 衡水市) {
        this.衡水市 = 衡水市;
    }

    public double get张家口市() {
        return 张家口市;
    }

    public void set张家口市(double 张家口市) {
        this.张家口市 = 张家口市;
    }

    public double get承德市() {
        return 承德市;
    }

    public void set承德市(double 承德市) {
        this.承德市 = 承德市;
    }

    public double get沧州市() {
        return 沧州市;
    }

    public void set沧州市(double 沧州市) {
        this.沧州市 = 沧州市;
    }

    public double get邯郸市() {
        return 邯郸市;
    }

    public void set邯郸市(double 邯郸市) {
        this.邯郸市 = 邯郸市;
    }

    public double get秦皇岛市() {
        return 秦皇岛市;
    }

    public void set秦皇岛市(double 秦皇岛市) {
        this.秦皇岛市 = 秦皇岛市;
    }

    public double get石家庄市() {
        return 石家庄市;
    }

    public void set石家庄市(double 石家庄市) {
        this.石家庄市 = 石家庄市;
    }

    public double get唐山市() {
        return 唐山市;
    }

    public void set唐山市(double 唐山市) {
        this.唐山市 = 唐山市;
    }

    public double get邢台市() {
        return 邢台市;
    }

    public void set邢台市(double 邢台市) {
        this.邢台市 = 邢台市;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", 保定市='" + 保定市 + '\'' +
                ", 衡水市='" + 衡水市 + '\'' +
                ", 张家口市='" + 张家口市 + '\'' +
                ", 承德市='" + 承德市 + '\'' +
                ", 沧州市='" + 沧州市 + '\'' +
                ", 邯郸市='" + 邯郸市 + '\'' +
                ", 秦皇岛市='" + 秦皇岛市 + '\'' +
                ", 石家庄市='" + 石家庄市 + '\'' +
                ", 唐山市='" + 唐山市 + '\'' +
                ", 邢台市='" + 邢台市 + '\'' +
                '}';
    }

    public DataEntity() {
    }

    public DataEntity(String name, double 保定市, double 衡水市, double 张家口市, double 承德市, double 沧州市, double 邯郸市, double 秦皇岛市, double 石家庄市, double 唐山市, double 邢台市) {
        this.name = name;
        this.保定市 = 保定市;
        this.衡水市 = 衡水市;
        this.张家口市 = 张家口市;
        this.承德市 = 承德市;
        this.沧州市 = 沧州市;
        this.邯郸市 = 邯郸市;
        this.秦皇岛市 = 秦皇岛市;
        this.石家庄市 = 石家庄市;
        this.唐山市 = 唐山市;
        this.邢台市 = 邢台市;
    }
}

