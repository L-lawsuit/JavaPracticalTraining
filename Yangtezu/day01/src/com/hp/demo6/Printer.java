package com.hp.demo6;

import com.hp.demo6.service.InkBox;
import com.hp.demo6.service.Paper;

public class Printer {
    private InkBox inkBox;
    private Paper paper;


    public void print(){
        System.out.println(inkBox.inkShow() + "墨盒在" + paper.paperShow() + "纸上打印");
    }

    public Printer() {
    }

    public Printer(InkBox inkBox, Paper paper) {
        this.inkBox = inkBox;
        this.paper = paper;
    }

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
