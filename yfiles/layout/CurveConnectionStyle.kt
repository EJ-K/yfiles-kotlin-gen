// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

/**
 * Enumeration to define how curved edge paths connect at the source and target side of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle">Online Documentation</a>
 */

sealed external class CurveConnectionStyle {
  /**
   * Curve connection style that keeps the port and the first/last segment that the layout algorithm would produce without curve routing.
   * 
   * Value - `0`
   * @see [yfiles.hierarchic.RoutingStyleDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.hierarchic.RoutingStyleDescriptor.targetCurveConnectionStyle]
   * @see [yfiles.router.EdgeRouterEdgeDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.router.EdgeRouterEdgeDescriptor.targetCurveConnectionStyle]
   * @see [yfiles.router.CurveRoutingEdgeDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.router.CurveRoutingEdgeDescriptor.targetCurveConnectionStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle%23KEEP_PORT">Online Documentation</a>
   */
  object KEEP_PORT: CurveConnectionStyle
  
  /**
   * Curve connection style that changes the part of a curved edge path such that the curves have a more organic-like and straight start or end.
   * 
   * Value - `1`
   * @see [yfiles.hierarchic.RoutingStyleDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.hierarchic.RoutingStyleDescriptor.targetCurveConnectionStyle]
   * @see [yfiles.router.EdgeRouterEdgeDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.router.EdgeRouterEdgeDescriptor.targetCurveConnectionStyle]
   * @see [yfiles.router.CurveRoutingEdgeDescriptor.sourceCurveConnectionStyle]
   * @see [yfiles.router.CurveRoutingEdgeDescriptor.targetCurveConnectionStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveConnectionStyle%23ORGANIC">Online Documentation</a>
   */
  object ORGANIC: CurveConnectionStyle
}
