fetch("http://localhost:8080/artists")
.then(response => response.json())
.then(result => {
    result.map(createArtistCard);
});

const artistsGalleryWrapper = document.getElementById("artists-gallery");

function createArtistCard(artist) {
    const artistElement = document.createElement("div");
    artistElement.innerText = artist.name;

    artistsGalleryWrapper.appendChild(artistElement);
}

function createNewArtist() {
    const selectName = document.getElementById("create-artist-name").value;
    const selectAge = document.getElementById("create-artist-age").value;
    const selectImage = document.getElementById("create-artist-image").value;
    const selectGender = document.getElementById("create-artist-gender").value;

    const newArtist = {
        name: selectName,
        age: selectAge,
        image: selectImage,
        gender: selectGender
    };
    console.log(newArtist)
}

document.getElementById("create-artist-button")
    .addEventListener("click", createNewArtist);