// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.YFlags

/**
 * Describes the type of a [IHandle].
 * @see [IHandle.type]
 * @see [HandleInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes">Online Documentation</a>
 */
external class HandleTypes 
    private constructor(): YFlags<HandleTypes> {
    companion object {
    /**
 * A handle which serves a general purpose but should not be displayed.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23INVISIBLE">Online Documentation</a>
 */
val INVISIBLE: HandleTypes
/**
 * A default variant modifier that decorates a basic type.
 * 
 * Value - `0`
 * @see [VARIANT_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23VARIANT1">Online Documentation</a>
 */
val VARIANT1: HandleTypes
/**
 * A default handle which serves a general purpose.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23DEFAULT">Online Documentation</a>
 */
val DEFAULT: HandleTypes
/**
 * A handle which can be used to resize something.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23RESIZE">Online Documentation</a>
 */
val RESIZE: HandleTypes
/**
 * A handle which can be used to rotate something.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23ROTATE">Online Documentation</a>
 */
val ROTATE: HandleTypes
/**
 * A handle which can be used to move something.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23MOVE">Online Documentation</a>
 */
val MOVE: HandleTypes
/**
 * A handle which can be used to shear an object.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23SHEAR">Online Documentation</a>
 */
val SHEAR: HandleTypes
/**
 * A handle which can be used to warp an object.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23WARP">Online Documentation</a>
 */
val WARP: HandleTypes
/**
 * A bitmask that can be used to query the basic type of a handle type.
 * 
 * Value - `255`
 * @see [DEFAULT]
 * @see [MOVE]
 * @see [RESIZE]
 * @see [ROTATE]
 * @see [SHEAR]
 * @see [WARP]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23TYPE_MASK">Online Documentation</a>
 */
val TYPE_MASK: HandleTypes
/**
 * The second variant modifier that decorates a basic type.
 * 
 * Value - `256`
 * @see [VARIANT_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23VARIANT2">Online Documentation</a>
 */
val VARIANT2: HandleTypes
/**
 * The third variant modifier that decorates a basic type.
 * 
 * Value - `512`
 * @see [VARIANT_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23VARIANT3">Online Documentation</a>
 */
val VARIANT3: HandleTypes
/**
 * The forth variant modifier that decorates a basic type.
 * 
 * Value - `768`
 * @see [VARIANT_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23VARIANT4">Online Documentation</a>
 */
val VARIANT4: HandleTypes
/**
 * A bitmask that can be used to query the variant of a basic handle type.
 * 
 * Value - `768`
 * @see [VARIANT1]
 * @see [VARIANT2]
 * @see [VARIANT3]
 * @see [VARIANT4]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23VARIANT_MASK">Online Documentation</a>
 */
val VARIANT_MASK: HandleTypes
/**
 * A modifier that can be used to tell the rendering engine to render the visual representation of this handle with an offset to the north.
 * 
 * Value - `4096`
 * @see [OFFSET_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23OFFSET_NORTH">Online Documentation</a>
 */
val OFFSET_NORTH: HandleTypes
/**
 * A modifier that can be used to tell the rendering engine to render the visual representation of this handle with an offset to the east.
 * 
 * Value - `8192`
 * @see [OFFSET_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23OFFSET_EAST">Online Documentation</a>
 */
val OFFSET_EAST: HandleTypes
/**
 * A modifier that can be used to tell the rendering engine to render the visual representation of this handle with an offset to the south.
 * 
 * Value - `16384`
 * @see [OFFSET_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23OFFSET_SOUTH">Online Documentation</a>
 */
val OFFSET_SOUTH: HandleTypes
/**
 * A modifier that can be used to tell the rendering engine to render the visual representation of this handle with an offset to the west.
 * 
 * Value - `32768`
 * @see [OFFSET_MASK]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23OFFSET_WEST">Online Documentation</a>
 */
val OFFSET_WEST: HandleTypes
/**
 * A bitmask that can be used to query the offsets of a basic handle type.
 * 
 * Value - `61440`
 * @see [OFFSET_NORTH]
 * @see [OFFSET_EAST]
 * @see [OFFSET_SOUTH]
 * @see [OFFSET_WEST]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleTypes%23OFFSET_MASK">Online Documentation</a>
 */
val OFFSET_MASK: HandleTypes

    }
}
