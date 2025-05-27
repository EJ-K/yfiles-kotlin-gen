// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration to define how curved edge paths connect at the source and target side of the edge.
 * @see [RoutingStyle.sourceCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.sourceCurveConnectionStyle]
 * @see [RoutingStyle.targetCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.targetCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle">Online Documentation</a>
 */
external sealed class CurveConnectionStyle: YEnum<CurveConnectionStyle> {
   companion object: EnumMetadata<CurveConnectionStyle> {
       /**
 * Curve connection style that keeps the port and the first/last segment that the layout algorithm would produce without curve routing.
 * 
 * Value - `0`
 * @see [RoutingStyle.sourceCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.sourceCurveConnectionStyle]
 * @see [RoutingStyle.targetCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.targetCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle%23KEEP_PORT">Online Documentation</a>
 */
val KEEP_PORT: CurveConnectionStyle

/**
 * Curve connection style that changes the part of a curved edge path such that the curves have a more organic-like and straight start or end.
 * 
 * Value - `1`
 * @see [RoutingStyle.sourceCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.sourceCurveConnectionStyle]
 * @see [RoutingStyle.targetCurveConnectionStyle][yfiles.hierarchic.RoutingStyle.targetCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [EdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.EdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.sourceCurveConnectionStyle]
 * @see [CurveEdgeLayoutDescriptor.targetCurveConnectionStyle][yfiles.router.CurveEdgeLayoutDescriptor.targetCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle%23ORGANIC">Online Documentation</a>
 */
val ORGANIC: CurveConnectionStyle
   }
}
