// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Holds all intersections as calculated by [Intersections].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionsResult">Online Documentation</a>
 */
external  class IntersectionsResult 
private constructor () : YObject {

/**
 * The number of [intersections][Intersection] as calculated by [Intersections].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionsResult%23intersectionCount">Online Documentation</a>
 */
final val intersectionCount: Int
/**
 * Gets a collection of [intersections][Intersection] each of which represents an intersection of two [IModelItem][yfiles.graph.IModelItem]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionsResult%23intersections">Online Documentation</a>
 */
final val intersections: ResultItemCollection<Intersection>

companion object : ClassMetadata<IntersectionsResult> {
}
}
