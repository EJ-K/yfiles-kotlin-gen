// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents an intersection as calculated by [Intersections].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersection">Online Documentation</a>
 */
external  class Intersection 
private constructor () : YObject {

/**
 * Gets a list of [points][Point] that describe the intersecting area or line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersection%23intersectionPoints">Online Documentation</a>
 */
final val intersectionPoints: IEnumerable<Point>
/**
 * Gets the first item that is involved in the intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersection%23item1">Online Documentation</a>
 */
final val item1: IModelItem
/**
 * Gets the second item that is involved in the intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersection%23item2">Online Documentation</a>
 */
final val item2: IModelItem

companion object : ClassMetadata<Intersection> {
}
}
