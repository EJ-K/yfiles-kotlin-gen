// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An info object that describes an intersection between two graph items.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionInfo">Online Documentation</a>
 */
external open class IntersectionInfo  : YObject {

/**
 * Gets a list of [YPoint][yfiles.algorithms.YPoint]s that describe the intersecting area or line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionInfo%23intersectionPoints">Online Documentation</a>
 */
open val intersectionPoints: IList<out Any>
/**
 * Gets the first item that is involved in the intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionInfo%23item1">Online Documentation</a>
 */
open val item1: Any
/**
 * Gets the second item that is involved in the intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionInfo%23item2">Online Documentation</a>
 */
open val item2: Any

companion object : ClassMetadata<IntersectionInfo> {
}
}
