// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.collections.IEnumerable
import yfiles.collections.IList
import yfiles.layout.IntersectionInfo
import yfiles.layout.IntersectionItemTypes
import yfiles.layout.LayoutGraph

/**
 * This class calculates the intersection of rectangles in the plane with the help of a sweep-line algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionAlgorithm">Online Documentation</a>
 */
external object IntersectionAlgorithm {
/**
 * Returns a list of intersections between the graph items or a subset of graph items.
 * @receiver the input graph
 * @param [intersectionItemType] the type(s) of graph items to consider
 * @param [affectedItems] the list of items that must be involved in each intersection or `null` if all items should be considered; can contain instances of type [Node], [Edge], [INodeLabelLayout][yfiles.layout.INodeLabelLayout], [IEdgeLabelLayout][yfiles.layout.IEdgeLabelLayout] and [LabelLayoutData][yfiles.layout.LabelLayoutData]
 * @return a list of intersections (of type [IntersectionInfo]) between graph items
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionAlgorithm%23IntersectionAlgorithm-defaultmethod-findIntersections">Online Documentation</a>
 */
   fun LayoutGraph.findIntersections( intersectionItemType: IntersectionItemTypes ,
 affectedItems: IEnumerable<Any> ):IList<out IntersectionInfo>
/**
 * Calculates the intersections of rectangles in the plane.
 * @param [objects] a list of `PlaneObject` objects.
 * @param [iHandler] intersections are reported to this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionAlgorithm%23IntersectionAlgorithm-method-intersect">Online Documentation</a>
 */
 final   fun <T : IPlaneObject>intersect( objects: YList<T> ,
 iHandler: IIntersectionHandler<T> )
}
