package pattern.proxy.protect;

/**
 * @author Tian
 * @version 1.0
 * @date 2015-10-07 17:40
 */
class PersionBeanImpl implements PersionBean {

    String name;
    String gender;
    String interests;

    int hotOrNotRating;

    int ratingCount=0;
    int rating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        return ratingCount==0 ? 0 : (rating/ratingCount);
    }

    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
