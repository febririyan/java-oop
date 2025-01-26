package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

// kata kunci final class dimana class nya tidak bisa di turunkan ke child nya
// final class Facebook extends SocialMedia {

// }

// final method
class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class fakeFacebook extends Facebook {
    // jadi error
    // void login(String username, String password) {

    // }
}

// Error
// class fakeFacebook extends Facebook {

// }


