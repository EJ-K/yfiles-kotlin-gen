// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [INodeLayout] encapsulates the layout information for a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout">Online Documentation</a>
 */
external interface INodeLayout : YObject {
/**
 * Gets the height of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23height">Online Documentation</a>
 */
val height: Double
/**
 * Gets the width of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23width">Online Documentation</a>
 */
val width: Double
/**
 * Gets the x-coordinate of the upper-left corner of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23x">Online Documentation</a>
 */
val x: Double
/**
 * Gets the y-coordinate of the upper-left corner of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23y">Online Documentation</a>
 */
val y: Double
/**
 * Sets the coordinates of the upper-left corner of the node.
 * @param [x] the new x-coordinate of the node
 * @param [y] the new y-coordinate of the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23INodeLayout-method-setLocation">Online Documentation</a>
 */
   fun setLocation( x: Double ,
 y: Double )
/**
 * Sets the size of the node.
 * @param [width] the new width of the node
 * @param [height] the new height of the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeLayout%23INodeLayout-method-setSize">Online Documentation</a>
 */
   fun setSize( width: Double ,
 height: Double )

companion object : InterfaceMetadata<INodeLayout> {
}
}
