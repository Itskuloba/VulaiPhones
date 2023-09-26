package com.example.vulaiphones.ui.theme.Screens.products

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vulaiphones.R
import com.example.vulaiphones.navigation.ROUTE_CHECKOUT
import com.example.vulaiphones.ui.theme.VulaiPhonesTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductScreen(navController:NavHostController) {
    var quantity by remember { mutableStateOf(1) }

    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(text = "Product Page")
//                },
//                navigationIcon = {
//                    IconButton(
//                        onClick = { /* Handle navigation icon click */ }
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.testpic1),
//                            contentDescription = null
//                        )
//
//                    }
//                },
//            )
//        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.i15),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 15",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

//            item {
//                Button(
//                    onClick = {
//                        // Handle Add to Cart button click
//                        navController.navigate(ROUTE_LOGIN)
//
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 16.dp)
//                ) {
//                    Text(text = "Add to Cart")
//                }
//            }

            item {
                Text(
                    text = "About it",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2023, September 12\n" +
                            "Status\tAvailable. Released 2023, September 22\n" +
                            "BODY\tDimensions\t146.6 x 70.6 x 8.3 mm (5.77 x 2.78 x 0.33 in)\n" +
                            "Weight\t187 g (6.60 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), titanium frame (grade 5)\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tLTPO Super Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (typ), 2000 nits (HBM)\n" +
                            "Size\t6.1 inches, 91.3 cm2 (~88.2% screen-to-body ratio)\n" +
                            "Resolution\t1179 x 2556 pixels, 19.5:9 ratio (~461 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            " \tAlways-On display\n" +
                            "PLATFORM\tOS\tiOS 17\n" +
                            "Chipset\tApple A17 Pro (3 nm)\n" +
                            "CPU\tHexa-core (2x3.78 GHz + 4x2.11 GHz)\n" +
                            "GPU\tApple GPU (6-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 8GB RAM, 256GB 8GB RAM, 512GB 8GB RAM, 1TB 8GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t48 MP, f/1.8, 24mm (wide), 1/1.28\", 1.22µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), 1.0µm, PDAF, OIS, 3x optical zoom\n" +
                            "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (4K@24/30fps), 3D (spatial) video, stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF, OIS\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@24/30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6e, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS (L1+L5), GLONASS, GALILEO, BDS, QZSS, NavIC\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tUSB Type-C 3.0, DisplayPort\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband 2 (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 3274 mAh, non-removable\n" +
                            "Charging\tWired, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)\n" +
                            "Reverse wired",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15plus),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 15 plus",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1099",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "About product",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "This is a sample product description. Replace this with the actual product description.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15pr),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 15 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1199",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2023, September 12\n" +
                            "Status\tAvailable. Released 2023, September 22\n" +
                            "BODY\tDimensions\t146.6 x 70.6 x 8.3 mm (5.77 x 2.78 x 0.33 in)\n" +
                            "Weight\t187 g (6.60 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), titanium frame (grade 5)\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tLTPO Super Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (typ), 2000 nits (HBM)\n" +
                            "Size\t6.1 inches, 91.3 cm2 (~88.2% screen-to-body ratio)\n" +
                            "Resolution\t1179 x 2556 pixels, 19.5:9 ratio (~461 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            " \tAlways-On display\n" +
                            "PLATFORM\tOS\tiOS 17\n" +
                            "Chipset\tApple A17 Pro (3 nm)\n" +
                            "CPU\tHexa-core (2x3.78 GHz + 4x2.11 GHz)\n" +
                            "GPU\tApple GPU (6-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 8GB RAM, 256GB 8GB RAM, 512GB 8GB RAM, 1TB 8GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t48 MP, f/1.8, 24mm (wide), 1/1.28\", 1.22µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), 1.0µm, PDAF, OIS, 3x optical zoom\n" +
                            "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (4K@24/30fps), 3D (spatial) video, stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF, OIS\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@24/30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6e, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS (L1+L5), GLONASS, GALILEO, BDS, QZSS, NavIC\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tUSB Type-C 3.0, DisplayPort\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband 2 (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 3274 mAh, non-removable\n" +
                            "Charging\tWired, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)\n" +
                            "Reverse wired",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i15pmx),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 15 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1299",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2023, September 12\n" +
                            "Status\tAvailable. Released 2023, September 22\n" +
                            "BODY\tDimensions\t159.9 x 76.7 x 8.3 mm (6.30 x 3.02 x 0.33 in)\n" +
                            "Weight\t221 g (7.80 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), titanium frame (grade 5)\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tLTPO Super Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (typ), 2000 nits (HBM)\n" +
                            "Size\t6.7 inches, 110.2 cm2 (~89.8% screen-to-body ratio)\n" +
                            "Resolution\t1290 x 2796 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            " \tAlways-On display\n" +
                            "PLATFORM\tOS\tiOS 17\n" +
                            "Chipset\tApple A17 Pro (3 nm)\n" +
                            "CPU\tHexa-core (2x3.78 GHz + 4x2.11 GHz)\n" +
                            "GPU\tApple GPU (6-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t256GB 8GB RAM, 512GB 8GB RAM, 1TB 8GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t48 MP, f/1.8, 24mm (wide), 1/1.28\", 1.22µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 120mm (periscope telephoto), 1.12µm, dual pixel PDAF, 3D sensor‑shift OIS, 5x optical zoom\n" +
                            "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (4K@24/30fps), 3D (spatial) video, stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF, OIS\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@24/30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6e, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS (L1+L5), GLONASS, GALILEO, BDS, QZSS, NavIC\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tUSB Type-C 3.0, DisplayPort\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband 2 (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 4441 mAh, non-removable\n" +
                            "Charging\tWired, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)\n" +
                            "Reverse wired",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 14",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $799",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "Aboout phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2022, September 07\n" +
                            "Status\tAvailable. Released 2022, September 16\n" +
                            "BODY\tDimensions\t146.7 x 71.5 x 7.8 mm (5.78 x 2.81 x 0.31 in)\n" +
                            "Weight\t172 g (6.07 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), aluminum frame\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, HDR10, Dolby Vision, 800 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t6.1 inches, 90.2 cm2 (~86.0% screen-to-body ratio)\n" +
                            "Resolution\t1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 16, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tDual\t12 MP, f/1.5, 26mm (wide), 1/1.7\", 1.9µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.4, 13mm, 120˚ (ultrawide)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, HDR, Dolby Vision HDR (up to 60fps), Cinematic mode (4K@30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 3279 mAh, non-removable (12.68 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14plus),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 14 plus",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $899",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2022, September 07\n" +
                            "Status\tAvailable. Released 2022, October 07\n" +
                            "BODY\tDimensions\t160.8 x 78.1 x 7.8 mm (6.33 x 3.07 x 0.31 in)\n" +
                            "Weight\t203 g (7.16 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), aluminum frame\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, HDR10, Dolby Vision, 800 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t6.7 inches, 109.8 cm2 (~87.4% screen-to-body ratio)\n" +
                            "Resolution\t1284 x 2778 pixels, 19.5:9 ratio (~458 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 16, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tDual\t12 MP, f/1.5, 26mm (wide), 1/1.7\", 1.9µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.4, 13mm, 120˚ (ultrawide)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, HDR, Dolby Vision HDR (up to 60fps), Cinematic mode (4K@30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 4323 mAh, non-removable (16.68 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i14pro),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 14 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }



            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2022, September 07\n" +
                            "Status\tAvailable. Released 2022, September 16\n" +
                            "BODY\tDimensions\t147.5 x 71.5 x 7.9 mm (5.81 x 2.81 x 0.31 in)\n" +
                            "Weight\t206 g (7.27 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), stainless steel frame\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tLTPO Super Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (typ), 2000 nits (HBM)\n" +
                            "Size\t6.1 inches, 91.7 cm2 (~87.0% screen-to-body ratio)\n" +
                            "Resolution\t1179 x 2556 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            " \tAlways-On display\n" +
                            "PLATFORM\tOS\tiOS 16, upgradable to iOS 17\n" +
                            "Chipset\tApple A16 Bionic (4 nm)\n" +
                            "CPU\tHexa-core (2x3.46 GHz Everest + 4x2.02 GHz Sawtooth)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM, 1TB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t48 MP, f/1.8, 24mm (wide), 1/1.28\", 1.22µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), 1/3.5\", 1.0µm, PDAF, OIS, 3x optical zoom\n" +
                            "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (4K@24/30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF, OIS (unconfirmed)\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@24/30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS (L1+L5), GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 3200 mAh, non-removable (12.38 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.testpic9),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 14 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $1099",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2022, September 07\n" +
                            "Status\tAvailable. Released 2022, September 16\n" +
                            "BODY\tDimensions\t160.7 x 77.6 x 7.9 mm (6.33 x 3.06 x 0.31 in)\n" +
                            "Weight\t240 g (8.47 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), stainless steel frame\n" +
                            "SIM\tNano-SIM and eSIM - International\n" +
                            "Dual eSIM with multiple numbers - USA\n" +
                            "Dual SIM (Nano-SIM, dual stand-by) - China\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tLTPO Super Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (typ), 2000 nits (HBM)\n" +
                            "Size\t6.7 inches, 110.2 cm2 (~88.3% screen-to-body ratio)\n" +
                            "Resolution\t1290 x 2796 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            " \tAlways-On display\n" +
                            "PLATFORM\tOS\tiOS 16, upgradable to iOS 17\n" +
                            "Chipset\tApple A16 Bionic (4 nm)\n" +
                            "CPU\tHexa-core (2x3.46 GHz Everest + 4x2.02 GHz Sawtooth)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM, 1TB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t48 MP, f/1.8, 24mm (wide), 1/1.28\", 1.22µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), 1/3.5\", 1.0µm, PDAF, OIS, 3x optical zoom\n" +
                            "12 MP, f/2.2, 13mm, 120˚ (ultrawide), 1/2.55\", 1.4µm, dual pixel PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (4K@24/30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/1.9, 23mm (wide), 1/3.6\", PDAF, OIS\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR, Cinematic mode (4K@24/30fps)\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@25/30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.3, A2DP, LE\n" +
                            "Positioning\tGPS (L1+L5), GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "Emergency SOS via satellite (SMS sending/receiving)\n" +
                            "BATTERY\tType\tLi-Ion 4323 mAh, non-removable (16.68 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13mini),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 13 mini",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $699",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

//            item {
//                Button(
//                    onClick = {
//                        // Handle Add to Cart button click
//                        navController.navigate(ROUTE_LOGIN)
//
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 16.dp)
//                ) {
//                    Text(text = "Add to Cart")
//                }
//            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2021, September 14\n" +
                            "Status\tAvailable. Released 2021, September 24\n" +
                            "BODY\tDimensions\t131.5 x 64.2 x 7.7 mm (5.18 x 2.53 x 0.30 in)\n" +
                            "Weight\t141 g (4.97 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), aluminum frame\n" +
                            "SIM\tNano-SIM and eSIM or Dual SIM (Nano-SIM, dual stand-by)\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, HDR10, Dolby Vision, 800 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t5.4 inches, 71.9 cm2 (~85.1% screen-to-body ratio)\n" +
                            "Resolution\t1080 x 2340 pixels, 19.5:9 ratio (~476 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 15, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (4-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tDual\t12 MP, f/1.6, 26mm (wide), 1.7µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.4, 120˚, 13mm (ultrawide)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/30/60fps, 1080p@30/60/120/240fps, HDR, Dolby Vision HDR (up to 60fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/2.2, 23mm (wide), 1/3.6\"\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.0, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "BATTERY\tType\tLi-Ion 2438 mAh, non-removable (9.34 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 13",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $799",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

//            item {
//                Button(
//                    onClick = {
//                        // Handle Add to Cart button click
//                        navController.navigate(ROUTE_LOGIN)
//
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 16.dp)
//                ) {
//                    Text(text = "Add to Cart")
//                }
//            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2021, September 14\n" +
                            "Status\tAvailable. Released 2021, September 24\n" +
                            "BODY\tDimensions\t146.7 x 71.5 x 7.7 mm (5.78 x 2.81 x 0.30 in)\n" +
                            "Weight\t174 g (6.14 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), aluminum frame\n" +
                            "SIM\tNano-SIM and eSIM or Dual SIM (Nano-SIM, dual stand-by)\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, HDR10, Dolby Vision, 800 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t6.1 inches, 90.2 cm2 (~86.0% screen-to-body ratio)\n" +
                            "Resolution\t1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 15, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (4-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tDual\t12 MP, f/1.6, 26mm (wide), 1.7µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.4, 120˚, 13mm (ultrawide)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/30/60fps, 1080p@30/60/120/240fps, HDR, Dolby Vision HDR (up to 60fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/2.2, 23mm (wide), 1/3.6\"\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.0, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "BATTERY\tType\tLi-Ion 3240 mAh, non-removable (12.41 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13pro),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 13 pro",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $899",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

//            item {
//                Button(
//                    onClick = {
//                        // Handle Add to Cart button click
//                        navController.navigate(ROUTE_LOGIN)
//
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 16.dp)
//                ) {
//                    Text(text = "Add to Cart")
//                }
//            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2021, September 14\n" +
                            "Status\tAvailable. Released 2021, September 24\n" +
                            "BODY\tDimensions\t146.7 x 71.5 x 7.7 mm (5.78 x 2.81 x 0.30 in)\n" +
                            "Weight\t204 g (7.20 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), stainless steel frame\n" +
                            "SIM\tNano-SIM and eSIM or Dual SIM (Nano-SIM, dual stand-by)\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t6.1 inches, 90.2 cm2 (~86.0% screen-to-body ratio)\n" +
                            "Resolution\t1170 x 2532 pixels, 19.5:9 ratio (~460 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 15, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM, 1TB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t12 MP, f/1.5, 26mm (wide), 1/1.7\", 1.9µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), PDAF, 1/3.5\", OIS, 3x optical zoom\n" +
                            "12 MP, f/1.8, 13mm, 120˚ (ultrawide), 1/3.5\", PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/30/60fps, 1080p@30/60/120/240fps, 10‑bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (1080p@30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/2.2, 23mm (wide), 1/3.6\"\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.0, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "BATTERY\tType\tLi-Ion 3095 mAh, non-removable (12.11 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }

            item {
                Image(
                    painter = painterResource(id = R.drawable.i13pmx),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
            }

            item {
                Text(
                    text = "Iphone 13 pro max",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text = "Price: $999",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Quantity:",
                        style = MaterialTheme.typography.bodySmall,
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    OutlinedTextField(
                        value = quantity.toString(),
                        onValueChange = {
                            quantity = it.toIntOrNull() ?: 1
                        },
                        keyboardActions = KeyboardActions(
                            onDone = {
                                // Handle keyboard done action
                            }
                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Done
                        ),
                        modifier = Modifier
                            .width(50.dp)
                            .padding(end = 8.dp)
                    )

                    Button(
                        onClick = {
                            if (quantity > 1) {
                                quantity--
                            }
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("-")
                    }

                    Button(
                        onClick = {
                            quantity++
                        },
                        modifier = Modifier.size(30.dp),
                    ) {
                        Text("+")
                    }
                }
            }

//            item {
//                Button(
//                    onClick = {
//                        // Handle Add to Cart button click
//                        navController.navigate(ROUTE_LOGIN)
//
//                    },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(top = 16.dp)
//                ) {
//                    Text(text = "Add to Cart")
//                }
//            }

            item {
                Text(
                    text = "About phone",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            item {
                Text(
                    text =
                    "\n" +
                            "NETWORK\tTechnology\t\n" +
                            "GSM / CDMA / HSPA / EVDO / LTE / 5G\n" +
                            "LAUNCH\tAnnounced\t2021, September 14\n" +
                            "Status\tAvailable. Released 2021, September 24\n" +
                            "BODY\tDimensions\t160.8 x 78.1 x 7.7 mm (6.33 x 3.07 x 0.30 in)\n" +
                            "Weight\t240 g (8.47 oz)\n" +
                            "Build\tGlass front (Corning-made glass), glass back (Corning-made glass), stainless steel frame\n" +
                            "SIM\tNano-SIM and eSIM or Dual SIM (Nano-SIM, dual stand-by)\n" +
                            " \tIP68 dust/water resistant (up to 6m for 30 min)\n" +
                            "Apple Pay (Visa, MasterCard, AMEX certified)\n" +
                            "DISPLAY\tType\tSuper Retina XDR OLED, 120Hz, HDR10, Dolby Vision, 1000 nits (HBM), 1200 nits (peak)\n" +
                            "Size\t6.7 inches, 109.8 cm2 (~87.4% screen-to-body ratio)\n" +
                            "Resolution\t1284 x 2778 pixels, 19.5:9 ratio (~458 ppi density)\n" +
                            "Protection\tCeramic Shield glass\n" +
                            "PLATFORM\tOS\tiOS 15, upgradable to iOS 17\n" +
                            "Chipset\tApple A15 Bionic (5 nm)\n" +
                            "CPU\tHexa-core (2x3.23 GHz Avalanche + 4x1.82 GHz Blizzard)\n" +
                            "GPU\tApple GPU (5-core graphics)\n" +
                            "MEMORY\tCard slot\tNo\n" +
                            "Internal\t128GB 6GB RAM, 256GB 6GB RAM, 512GB 6GB RAM, 1TB 6GB RAM\n" +
                            " \tNVMe\n" +
                            "MAIN CAMERA\tTriple\t12 MP, f/1.5, 26mm (wide), 1/1.7\", 1.9µm, dual pixel PDAF, sensor-shift OIS\n" +
                            "12 MP, f/2.8, 77mm (telephoto), PDAF, 1/3.5\", OIS, 3x optical zoom\n" +
                            "12 MP, f/1.8, 13mm, 120˚ (ultrawide), 1/3.5\", PDAF\n" +
                            "TOF 3D LiDAR scanner (depth)\n" +
                            "Features\tDual-LED dual-tone flash, HDR (photo/panorama)\n" +
                            "Video\t4K@24/30/60fps, 1080p@30/60/120/240fps, 10-bit HDR, Dolby Vision HDR (up to 60fps), ProRes, Cinematic mode (1080p@30fps), stereo sound rec.\n" +
                            "SELFIE CAMERA\tSingle\t12 MP, f/2.2, 23mm (wide), 1/3.6\"\n" +
                            "SL 3D, (depth/biometrics sensor)\n" +
                            "Features\tHDR\n" +
                            "Video\t4K@24/25/30/60fps, 1080p@30/60/120fps, gyro-EIS\n" +
                            "SOUND\tLoudspeaker\tYes, with stereo speakers\n" +
                            "3.5mm jack\tNo\n" +
                            "COMMS\tWLAN\tWi-Fi 802.11 a/b/g/n/ac/6, dual-band, hotspot\n" +
                            "Bluetooth\t5.0, A2DP, LE\n" +
                            "Positioning\tGPS, GLONASS, GALILEO, BDS, QZSS\n" +
                            "NFC\tYes\n" +
                            "Radio\tNo\n" +
                            "USB\tLightning, USB 2.0\n" +
                            "FEATURES\tSensors\tFace ID, accelerometer, gyro, proximity, compass, barometer\n" +
                            " \tUltra Wideband (UWB) support\n" +
                            "BATTERY\tType\tLi-Ion 4352 mAh, non-removable (16.75 Wh)\n" +
                            "Charging\tWired, PD2.0, 50% in 30 min (advertised)\n" +
                            "15W wireless (MagSafe)\n" +
                            "7.5W wireless (Qi)",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            item {
                Button(
                    onClick = {
                        // Handle Add to Cart button click
                        navController.navigate(ROUTE_CHECKOUT)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Check out")
                }
            }
        }



    }
    }



@Preview
@Composable
fun Produvtpreview() {
    VulaiPhonesTheme {
        ProductScreen(rememberNavController())
    }

}

