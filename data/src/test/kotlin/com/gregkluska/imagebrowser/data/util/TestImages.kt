package com.gregkluska.imagebrowser.data.util

import com.gregkluska.imagebrowser.data.model.ImageDto
import com.gregkluska.imagebrowser.data.model.TagDto
import com.gregkluska.imagebrowser.data.model.UrlsDto
import com.gregkluska.imagebrowser.data.model.UserDto

internal val PHOTO_ID_1_TEST = ImageDto(
    id = "ua-yfFmM_UU",
    description = "Nature Reserve - NEOM, Saudi Arabia | The NEOM Nature Reserve region is being designed to deliver protection and restoration of biodiversity across 95% of NEOM.",
    tags = listOf(
        TagDto(title = "background"),
        TagDto(title = "neom"),
        TagDto(title = "nature reserve"),
        TagDto(title = "explorer"),
        TagDto(title = "exploring"),
        TagDto(title = "walking"),
        TagDto(title = "scenic"),
        TagDto(title = "explore"),
        TagDto(title = "hiking"),
        TagDto(title = "traveller"),
        TagDto(title = "travel"),
        TagDto(title = "destination"),
        TagDto(title = "adventurer"),
        TagDto(title = "hiker"),
        TagDto(title = "adventure"),
        TagDto(title = "hike"),
        TagDto(title = "exploration"),
        TagDto(title = "experience"),
        TagDto(title = "remote place"),
        TagDto(title = "sweatshirt")
    ),
    urls = UrlsDto(
        raw = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4NzcyMDB8&ixlib=rb-4.0.3",
        full = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4NzcyMDB8&ixlib=rb-4.0.3&q=85",
        regular = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4NzcyMDB8&ixlib=rb-4.0.3&q=80&w=1080",
        small = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4NzcyMDB8&ixlib=rb-4.0.3&q=80&w=400",
        thumb = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4NzcyMDB8&ixlib=rb-4.0.3&q=80&w=200"
    ),
    user = UserDto(id = "mYizSrdJkkU", username = "neom", name = "NEOM")
)

internal val PHOTO_ID_2_TEST = ImageDto(
    id = "p8Xp5DWQpVc",
    description = "Amongst expansive red sands and spectacular sandstone rock formations, Hisma Desert – NEOM, Saudi Arabia | The NEOM Nature Reserve region is being designed to deliver protection and restoration of biodiversity across 95% of NEOM.",
    tags = listOf(
        TagDto(title = "hisma desert –  neom"),
        TagDto(title = "saudi arabia"),
        TagDto(title = "background"),
        TagDto(title = "scenery"),
        TagDto(title = "scenic"),
        TagDto(title = "wallpaper"),
        TagDto(title = "vista"),
        TagDto(title = "travel destination"),
        TagDto(title = "travel"),
        TagDto(title = "saudi arabia"),
        TagDto(title = "desert"),
        TagDto(title = "hisma desert"),
        TagDto(title = "adult"),
        TagDto(title = "female"),
        TagDto(title = "person"),
        TagDto(title = "woman"),
        TagDto(title = "hat"),
        TagDto(title = "landmark"),
        TagDto(title = "antelope canyon"),
        TagDto(title = "plant")
    ),
    urls = UrlsDto(
        raw = "https://images.unsplash.com/photo-1682685797332-e678a04f8a64?ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4Nzg2Mzd8&ixlib=rb-4.0.3",
        full = "https://images.unsplash.com/photo-1682685797332-e678a04f8a64?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4Nzg2Mzd8&ixlib=rb-4.0.3&q=85",
        regular = "https://images.unsplash.com/photo-1682685797332-e678a04f8a64?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4Nzg2Mzd8&ixlib=rb-4.0.3&q=80&w=1080",
        small = "https://images.unsplash.com/photo-1682685797332-e678a04f8a64?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4Nzg2Mzd8&ixlib=rb-4.0.3&q=80&w=400",
        thumb = "https://images.unsplash.com/photo-1682685797332-e678a04f8a64?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHx8fHx8fHx8fDE2OTI4Nzg2Mzd8&ixlib=rb-4.0.3&q=80&w=200"
    ),
    user = UserDto(id = "mYizSrdJkkU", username = "neom", name = "NEOM")
)

internal val PHOTOS_TEST = listOf(
    ImageDto(
        id = "ua-yfFmM_UU",
        description = "Nature Reserve - NEOM, Saudi Arabia | The NEOM Nature Reserve region is being designed to deliver protection and restoration of biodiversity across 95% of NEOM.",
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?ixid=M3w0OTE5NjF8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1682687219356-e820ca126c92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHwxfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "mYizSrdJkkU", username = "neom", name = "NEOM")
    ),

    ImageDto(
        id = "UJiCjtuI0FQ",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692532560357-ff67799c921a?ixid=M3w0OTE5NjF8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692532560357-ff67799c921a?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692532560357-ff67799c921a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692532560357-ff67799c921a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692532560357-ff67799c921a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwyfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "f_a5-ZgMcac", username = "masamasa3", name = "masahiro miyagi")
    ),

    ImageDto(
        id = "K6cmi2-t9ak",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692770723795-f6a5c78fee33?ixid=M3w0OTE5NjF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692770723795-f6a5c78fee33?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692770723795-f6a5c78fee33?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692770723795-f6a5c78fee33?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692770723795-f6a5c78fee33?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(
            id = "nL--87Jqshc",
            username = "eugene_golovesov",
            name = "Eugene Golovesov"
        )
    ),

    ImageDto(
        id = "FlNtJfNpJtE",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692528131001-5897bedce1b8?ixid=M3w0OTE5NjF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692528131001-5897bedce1b8?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692528131001-5897bedce1b8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692528131001-5897bedce1b8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692528131001-5897bedce1b8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "mJ8MnJd8h08", username = "rasand", name = "Rasmus Andersen")
    ),

    ImageDto(
        id = "hwdbmbL2Duo",
        description = "A Stroll",
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692764619881-0c41dcdbab2c?ixid=M3w0OTE5NjF8MHwxfGFsbHw1fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692764619881-0c41dcdbab2c?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw1fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692764619881-0c41dcdbab2c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw1fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692764619881-0c41dcdbab2c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw1fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692764619881-0c41dcdbab2c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw1fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "oYnvKSokMUs", username = "zinco", name = "Raul De Los Santos")
    ),

    ImageDto(
        id = "yg6v0KoiIcU",
        description = "Amongst expansive red sands and spectacular sandstone rock formations, Hisma Desert – NEOM, Saudi Arabia | The NEOM Nature Reserve region is being designed to deliver protection and restoration of biodiversity across 95% of NEOM",
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1682685795463-0674c065f315?ixid=M3w0OTE5NjF8MXwxfGFsbHw2fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1682685795463-0674c065f315?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHw2fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1682685795463-0674c065f315?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHw2fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1682685795463-0674c065f315?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHw2fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1682685795463-0674c065f315?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MXwxfGFsbHw2fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "mYizSrdJkkU", username = "neom", name = "NEOM")
    ),

    ImageDto(
        id = "bJwI0NuXwKs",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692366605319-2781e564ef03?ixid=M3w0OTE5NjF8MHwxfGFsbHw3fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692366605319-2781e564ef03?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw3fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692366605319-2781e564ef03?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw3fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692366605319-2781e564ef03?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw3fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692366605319-2781e564ef03?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw3fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "lkesy2Bw8Mo", username = "mrnuclear", name = "ZHENYU LUO")
    ),

    ImageDto(
        id = "u7zB3OyuDZU",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692317787245-366c18a2ae2e?ixid=M3w0OTE5NjF8MHwxfGFsbHw4fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692317787245-366c18a2ae2e?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw4fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692317787245-366c18a2ae2e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw4fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692317787245-366c18a2ae2e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw4fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692317787245-366c18a2ae2e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw4fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(
            id = "O4YgXMiTtzc",
            username = "jaspergarrattphotography",
            name = "Jasper Garratt"
        )
    ),

    ImageDto(
        id = "nrIKJSnZOjg",
        description = "symmetry",
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692221368911-cbc49e75680f?ixid=M3w0OTE5NjF8MHwxfGFsbHw5fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692221368911-cbc49e75680f?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw5fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692221368911-cbc49e75680f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw5fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692221368911-cbc49e75680f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw5fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692221368911-cbc49e75680f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHw5fHx8fHx8Mnx8MTY5Mjg3MjYwOXw&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(id = "5DjBq7QKUkc", username = "rajabbarack", name = "Rajab Guga")
    ),

    ImageDto(
        id = "W3JF-Bg8PRc",
        description = null,
        tags = listOf(),
        urls = UrlsDto(
            raw = "https://images.unsplash.com/photo-1692481130055-5508b8ba260d?ixid=M3w0OTE5NjF8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2OTI4NzI2MDl8&ixlib=rb-4.0.3",
            full = "https://images.unsplash.com/photo-1692481130055-5508b8ba260d?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2OTI4NzI2MDl8&ixlib=rb-4.0.3&q=85",
            regular = "https://images.unsplash.com/photo-1692481130055-5508b8ba260d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2OTI4NzI2MDl8&ixlib=rb-4.0.3&q=80&w=1080",
            small = "https://images.unsplash.com/photo-1692481130055-5508b8ba260d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2OTI4NzI2MDl8&ixlib=rb-4.0.3&q=80&w=400",
            thumb = "https://images.unsplash.com/photo-1692481130055-5508b8ba260d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTE5NjF8MHwxfGFsbHwxMHx8fHx8fDJ8fDE2OTI4NzI2MDl8&ixlib=rb-4.0.3&q=80&w=200"
        ),
        user = UserDto(
            id = "sd-_3jJwYiA",
            username = "gabrieluizramos",
            name = "Gabriel Ramos"
        )
    )
)