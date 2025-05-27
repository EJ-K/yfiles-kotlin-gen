// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface describes a 2-dimensional object which has a finite bounding box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPlaneObject">Online Documentation</a>
 */
external interface IPlaneObject : YObject {
/**
 * Gets the smallest Rectangle which contains the object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPlaneObject%23boundingBox">Online Documentation</a>
 */
val boundingBox: YRectangle

companion object : InterfaceMetadata<IPlaneObject> {
}
}
