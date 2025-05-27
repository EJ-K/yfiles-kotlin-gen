// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for an object that has a size in 2D coordinate space with double precision floating point size values.
 * @see [IMutableSize]
 * @see [MutableSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISize">Online Documentation</a>
 */
external interface ISize : YObject {
/**
 * Gets the current height of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISize%23height">Online Documentation</a>
 */
val height: Double
/**
 * Gets the current width of this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISize%23width">Online Documentation</a>
 */
val width: Double
/**
 * Converts the [ISize] to a [Size] struct.
 * @return A [Size] struct that has been initialized with the current values of `size`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISize%23ISize-defaultmethod-toSize">Online Documentation</a>
 */
  final  fun toSize():Size = definedExternally

companion object : InterfaceMetadata<ISize> {
}
}
