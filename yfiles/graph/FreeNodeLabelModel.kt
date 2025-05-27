// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ILookup
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata

/**
 * This node label model can be used to specify any position and orientation of a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel">Online Documentation</a>
 */
external class FreeNodeLabelModel private constructor() : ILabelModel {
  /**
   * Creates a parameter instance that anchors the label to the node at a given position.
   * @param [layoutRatio] The ratio that describes the point on the node's layout relative to its upper-left corner. A value of (0,0) describes the upper-left corner, while (1,1) is the lower-right corner.
   * @param [layoutOffset] The absolute offset to apply to the point on the node after the ratio has been determined.
   * @param [labelRatio] The ratio that describes the point on the label's layout relative to its upper-left corner. A value of (0,0) describes the upper-left corner, while (1,1) is the lower-right corner.
   * @param [labelOffset] The absolute offset to apply to the point on the label after the ratio has been determined. This defaults to (0,0), representing no further offset.
   * @param [angle] The angle by which the label should be rotated around the point described using the ratio and offset, measured in radians. The default is 0.
   * @return A parameter that exactly fits the described location.
   * @throws ArgumentError `layoutRatio`, `layoutOffset`, `labelRatio` or `labelOffset` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23FreeNodeLabelModel-method-createParameter">Online Documentation</a>
   */
  fun createParameter(
    layoutRatio: Point,
    layoutOffset: Point,
    labelRatio: Point,
    labelOffset: Point  = definedExternally,
    angle: Double  = definedExternally,
  ): FreeNodeLabelModelParameter
  
  /**
   * Creates a parameter instance that anchors the `labelLayout` relative to the `nodeLayout`.
   * @param [nodeLayout] The node layout.
   * @param [labelLayout] The label layout.
   * @param [referenceLocation] A reference location that influences the ratio and offset calculation for the [createParameter][FreeNodeLabelModel] call.
   * @return The canonical parameter for the specified node and label layout.
   * @throws ArgumentError `nodeLayout` or `referenceLocation` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23FreeNodeLabelModel-method-createParameterForLayouts">Online Documentation</a>
   */
  fun createParameterForLayouts(
    nodeLayout: Rect,
    labelLayout: IOrientedRectangle,
    referenceLocation: Point  = definedExternally,
  ): FreeNodeLabelModelParameter
  
  /**
   * Tries to find a parameter that best matches the given layout for the provided label instance.
   * @param [label] The label to find a parameter for.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23FreeNodeLabelModel-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    label: ILabel,
    layout: IOrientedRectangle,
  ): ILabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23FreeNodeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23FreeNodeLabelModel-method-getGeometry">Online Documentation</a>
   */
  override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<FreeNodeLabelModel> {
    /**
     * A predefined parameter instance that places the label anchored at the node center and has no rotation
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23CENTER">Online Documentation</a>
     */
     val CENTER: FreeNodeLabelModelParameter
    
    /**
     * A shared public instance that can be used to obtain parameters.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeNodeLabelModel%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: FreeNodeLabelModel
  }
}
