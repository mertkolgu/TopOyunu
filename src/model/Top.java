package model;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Top extends JButton {

    private Point dokunulanYer, eskiYer, yeniYer;
    private Cursor fareKursoru = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    private double xHizi;
    private double yHizi;
    private double yedekXHizi, yedekYHizi;

    public Top() {
        suruklemeOlaylariEkle();
        setIcon(new ImageIcon(Sabitler.TOP_RESMI));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
    }

    public void hareketEt() {
        int carpmaGenislik = getParent().getSize().width - getSize().width;
        int carpmaYukseklik = getParent().getSize().height - getSize().height;
        if ((getLocation().x >= carpmaGenislik) || (getLocation().x <= 0)) {
            setxHizi(getxHizi() * -1);
        } else if ((getLocation().y >= carpmaYukseklik) || (getLocation().y <= 0)) {
            setyHizi(getyHizi() * -1);
        }
        Point konum = new Point();
        konum.setLocation(getLocation().x + getxHizi(), getLocation().y + getyHizi());
        setLocation(konum);
    }

    public void suruklemeOlaylariEkle() {
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                dokunulanYer = e.getPoint();
                setCursor(fareKursoru);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Point ekrandakiYer = getParent().getLocationOnScreen();
                Point fareninEkrandaki = e.getLocationOnScreen();
                Point yeniYer = new Point(fareninEkrandaki.x - ekrandakiYer.x - dokunulanYer.x, fareninEkrandaki.y - ekrandakiYer.y - dokunulanYer.y);
                setLocation(yeniYer);
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                eskiYer = getLocation();
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setYeniYer(getLocation());
                double aci = Math.atan2(getYeniYer().y - eskiYer.y, getYeniYer().x - eskiYer.x);
                setxHizi(Math.cos(aci) * Math.abs(yedekXHizi));
                setyHizi(Math.sin(aci) * Math.abs(yedekYHizi));
            }
        });
    }

    /**
     * @return the dokunulanYer
     */
    public Point getDokunulanYer() {
        return dokunulanYer;
    }

    /**
     * @param dokunulanYer the dokunulanYer to set
     */
    public void setDokunulanYer(Point dokunulanYer) {
        this.dokunulanYer = dokunulanYer;
    }

    /**
     * @return the eskiYer
     */
    public Point getEskiYer() {
        return eskiYer;
    }

    /**
     * @param eskiYer the eskiYer to set
     */
    public void setEskiYer(Point eskiYer) {
        this.eskiYer = eskiYer;
    }

    /**
     * @return the yeniYer
     */
    public Point getYeniYer() {
        return yeniYer;
    }

    /**
     * @param yeniYer the yeniYer to set
     */
    public void setYeniYer(Point yeniYer) {
        this.yeniYer = yeniYer;
    }

    /**
     * @return the fareKursoru
     */
    public Cursor getFareKursoru() {
        return fareKursoru;
    }

    /**
     * @param fareKursoru the fareKursoru to set
     */
    public void setFareKursoru(Cursor fareKursoru) {
        this.fareKursoru = fareKursoru;
    }

    /**
     * @return the xHizi
     */
    public double getxHizi() {
        return xHizi;
    }

    /**
     * @param xHizi the xHizi to set
     */
    public void setxHizi(double xHizi) {
        this.xHizi = xHizi;
    }

    /**
     * @return the yHizi
     */
    public double getyHizi() {
        return yHizi;
    }

    /**
     * @param yHizi the yHizi to set
     */
    public void setyHizi(double yHizi) {
        this.yHizi = yHizi;
    }

    /**
     * @return the yedekXHizi
     */
    public double getYedekXHizi() {
        return yedekXHizi;
    }

    /**
     * @param yedekXHizi the yedekXHizi to set
     */
    public void setYedekXHizi(double yedekXHizi) {
        this.yedekXHizi = yedekXHizi;
    }

    /**
     * @return the yedekYHizi
     */
    public double getYedekYHizi() {
        return yedekYHizi;
    }

    /**
     * @param yedekYHizi the yedekYHizi to set
     */
    public void setYedekYHizi(double yedekYHizi) {
        this.yedekYHizi = yedekYHizi;
    }
}
