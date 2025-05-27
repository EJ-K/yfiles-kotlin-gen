// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YPoint
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An [IIntersectionCalculator] is responsible for calculating the intersection point between an edge and the visual representation of its source or target node.
 * @see [PortCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionCalculator">Online Documentation</a>
 */
external interface IIntersectionCalculator : YObject {
/**
 * Calculates an intersection point between the edge and the given [INodeLayout].
 * @param [nodeLayout] the layout information of the node
 * @param [xOffset] the x-coordinate of a point on the last line segment relative to the node's center
 * @param [yOffset] the y-coordinate of a point on the last line segment relative to the node's center
 * @param [dx] the x-component of the normalized direction vector indicating the direction of the segment pointing towards the node
 * @param [dy] the y-component of the normalized direction vector indicating the direction of the segment pointing towards the node
 * @return the intersection coordinates relative to the node's center or `null` if no such intersection was found
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionCalculator%23IIntersectionCalculator-method-calculateIntersectionPoint">Online Documentation</a>
 */
   fun calculateIntersectionPoint( nodeLayout: INodeLayout ,
 xOffset: Double ,
 yOffset: Double ,
 dx: Double ,
 dy: Double ):YPoint?

companion object : InterfaceMetadata<IIntersectionCalculator> {

/**
 * Creates an implementation of the interface [IIntersectionCalculator] by using the given function as implementation for its [calculateIntersectionPoint] method.
 * @param [calculateIntersectionPoint] A function for [IIntersectionCalculator]'s single abstract method [calculateIntersectionPoint].
 * @return An instance of the [IIntersectionCalculator] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionCalculator%23IIntersectionCalculator-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                calculateIntersectionPoint: (
            nodeLayout: INodeLayout,
xOffset: Double,
yOffset: Double,
dx: Double,
dy: Double
            ) -> YPoint 
            ):IIntersectionCalculator
}
}
