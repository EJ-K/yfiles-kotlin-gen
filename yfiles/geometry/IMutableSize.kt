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

/**
 * Interface for a mutable size in 2D coordinate space with double precision width and height.
 * @see [ISize]
 * @see [MutableSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableSize">Online Documentation</a>
 */
external interface IMutableSize : ISize {
/**
 * Gets or sets the height of this instance.
 * @see [ISize.height]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableSize%23height">Online Documentation</a>
 */
override var height: Double
/**
 * Gets or sets the width of this instance.
 * @see [ISize.width]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableSize%23width">Online Documentation</a>
 */
override var width: Double
/**
 * Sets the coordinates of the size to the given values.
 * @param [newSize] The new location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableSize%23IMutableSize-defaultmethod-resize(ISize)">Online Documentation</a>
 */
  final  fun resize( newSize: ISize ):Unit = definedExternally
/**
 * Sets the coordinates of the size to the given values.
 * @param [newWidth] The new x coordinate
 * @param [newHeight] The new y coordinate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IMutableSize%23IMutableSize-defaultmethod-resize(number,number)">Online Documentation</a>
 */
  final  fun resize( newWidth: Double ,
 newHeight: Double ):Unit = definedExternally

companion object : InterfaceMetadata<IMutableSize> {
}
}
