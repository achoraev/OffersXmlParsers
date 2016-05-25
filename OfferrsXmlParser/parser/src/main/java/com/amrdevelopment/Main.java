package com.amrdevelopment;

import com.amrdevelopment.model.*;
import com.amrdevelopment.partners.deals.Contacts;
import com.amrdevelopment.partners.deals.Offer;
import com.amrdevelopment.partners.deals.Offers;
import com.amrdevelopment.partners.grupovo.Item;
import com.amrdevelopment.partners.vipoferta.Deals;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException {

        List<MainOffer> allDeals = new ArrayList<MainOffer>();

        Offers dealsBgOffers = DealsBgParser();
        allDeals.addAll(convertDealBgOffers(dealsBgOffers));

        Deals vipOfertaOffers = vipOfertaParser();

        Deals onFireDeals = onFireParser();

        com.amrdevelopment.partners.grupo.Offers grupoOffers = grupoParser();

//        graboParser();

        com.amrdevelopment.partners.riobg.Offers rioOffers = riobgParser();

//        vsichkiOfertiParser();

//        partners.grupovo.Item grupovoOffers = grupovoParser();

        int offerCount = (dealsBgOffers.getOffers().size()) +
                (vipOfertaOffers.getDeals().size()) +
                (onFireDeals.getDeals().size()) +
                (grupoOffers.getOffers().size()) +
                (rioOffers.getOffers().size());
        System.out.println("Oferti: " + offerCount);
    }

    private static Collection<? extends MainOffer> convertDealBgOffers(Offers dealsBgOffers) {
        List<MainOffer> result = new ArrayList<MainOffer>();
        for (Offer off : dealsBgOffers.getOffers()){
            MainOffer current = new MainOffer();
            current.setId(off.getId());
            current.setCities(off.getCities());
            current.setCategories(off.getCategories());
            current.setTitle(off.getTitle());
            current.setDescription(off.getDescription());
            current.setTerms(off.getTerms());

            Price price = new Price();
            price.setOriginalPrice(off.getOriginalPrice());
            price.setPromoPrice(off.getPromoPrice());
            price.setDiscountInPercent(off.getDiscountInPercent());

            current.setPrice(price);
            current.setSold(off.getSold());

            Validation valid = new Validation();
            valid.setEnd(off.getEnd());
            valid.setUpdated(off.getUpdated());

            current.setValidation(valid);
            current.setLink(off.getLinkToOffer());

            List<Picture> pics = new ArrayList<>();
            for (com.amrdevelopment.partners.deals.Picture pic : off.getPictures()){
                Picture currentPic = new Picture();
                currentPic.setLink(pic.getPictureLink());
                pics.add(currentPic);
            }

            current.setPictures(pics);

            List<com.amrdevelopment.model.Merchant> merchants = new ArrayList<>();
            for (com.amrdevelopment.partners.deals.Merchant m : off.getMerchants()){
                com.amrdevelopment.model.Merchant currentMerc = new com.amrdevelopment.model.Merchant();
                currentMerc.setName(m.getName());

                List<Contact> contacts = new ArrayList<Contact>();
                for(Contacts c : m.getContacts()){
                    Contact con = new Contact();
                    con.setLatitude(c.getContact().getLatitude());
                    con.setLongtitude(c.getContact().getLongtitude());
                    contacts.add(con);
                }

                currentMerc.setContacts(contacts);
                merchants.add(currentMerc);
            }

            current.setMerchants(merchants);
            current.setPriority(off.getPriority());
            current.setRpvlt(off.getRplt());
            current.setRpv24(off.getRpv24());
            result.add(current);
        }

        return result;
    }

    private static void vsichkiOfertiParser() {
//        File file = new File("./vsichkiOferti.xml");
//        JAXBContext jaxbContext = JAXBContext.newInstance(Item.class);
//        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//        Item offers = (Item) jaxbUnmarshaller.unmarshal(file);
    }

    private static com.amrdevelopment.partners.riobg.Offers riobgParser() throws JAXBException {
        File file = new File("./riobg.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(com.amrdevelopment.partners.riobg.Offers.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        com.amrdevelopment.partners.riobg.Offers offers = (com.amrdevelopment.partners.riobg.Offers) jaxbUnmarshaller.unmarshal(file);
        return offers;
    }

    private static void graboParser() {

    }

    private static Item grupovoParser() throws JAXBException {
        File file = new File("./grupovo.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Item.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Item offers = (Item) jaxbUnmarshaller.unmarshal(file);
        return offers;
    }

    private static com.amrdevelopment.partners.grupo.Offers grupoParser() throws JAXBException {
        File file = new File("./grupo.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(com.amrdevelopment.partners.grupo.Offers.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        com.amrdevelopment.partners.grupo.Offers offers = (com.amrdevelopment.partners.grupo.Offers) jaxbUnmarshaller.unmarshal(file);
        return offers;
    }

    private static Deals onFireParser() throws JAXBException {
        File file = new File("./onfire47678.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Deals.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Deals deals = (Deals) jaxbUnmarshaller.unmarshal(file);
        return deals;
    }

    private static void onfireParser() {
    }

    private static Deals vipOfertaParser() throws JAXBException {
        File file = new File("./vipoferta.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Deals.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Deals offers = (Deals) jaxbUnmarshaller.unmarshal(file);
        return offers;
    }

    private static Offers DealsBgParser() throws JAXBException {
        File file = new File("./deals.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Offers.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Offers offers = (Offers) jaxbUnmarshaller.unmarshal(file);
        return offers;
    }
}
