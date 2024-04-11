//including the things we need
#include <iostream>
#include <sstream>
#include <iomanip>

std::string rgb_to_hex(int r, int g, int b)
{
    //assigning rgb values to r g and b
    r = std::max(0, std::min(255, r));
    g = std::max(0, std::min(255, g));
    b = std::max(0, std::min(255, b));

    //creating a string stream object
    std::stringstream ss;

    //adding color to string stream
    ss << std::uppercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    returign stringstream as a string
    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
