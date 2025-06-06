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
import yfiles.lang.ClassMetadata

/**
 * An edge label model that allows placement of labels relative to an edge segment at a set of continuous positions at specified [sides of the edge path][EdgeSegmentLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [EdgeSegmentLabelModel] class.
 * @param [distance] The distance to the edge.
 * @param [offset] The offset to the default placement.
 * @param [angle] The angle of the label's rotation in radians.
 * @param [autoRotation] If set to `true` auto rotation is enabled.
 * @param [sideOfEdge] The side of the edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-constructor-EdgeSegmentLabelModel">Online Documentation</a>
 * 
 * @property distance
 * Gets or sets the distance between the label box and the edge path.
 * @see [sideOfEdge]
 * @see [EdgeSides]
 * @see [offset]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23distance">Online Documentation</a>
 * 
 * @property offset
 * Gets or sets the offset of the label box and the edge path relative to the default placement.
 * @see [sideOfEdge]
 * @see [EdgeSides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23offset">Online Documentation</a>
 * 
 * @property angle
 * Gets or sets the rotation angle of all labels with this model in radians.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23angle">Online Documentation</a>
 * 
 * @property autoRotation
 * Gets or sets whether edge labels are automatically rotated according to the angle of the corresponding reference edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23autoRotation">Online Documentation</a>
 * 
 * @property sideOfEdge
 * Gets or sets the side placement specifiers for edge labels.
 * @see [EdgeSides]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23sideOfEdge">Online Documentation</a>
 */
open external class EdgeSegmentLabelModel (
final var distance: Double = definedExternally,
final var offset: Double = definedExternally,
final var angle: Double = definedExternally,
final var autoRotation: Boolean = definedExternally,
final var sideOfEdge: EdgeSides = definedExternally) : ILabelModel {
  /**
   * Creates a parameter where the label is attached to the edge segment that contains the edge's midpoint.
   * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of 0.0 will place the label at the source side of the segment, a ratio of 1.0 at the target side. Ratios < 0.0 or > 1.0 will be interpreted as absolute values in world coordinates. The default is 0.5.
   * @param [sideOfEdge] The side of the edge the label is placed on. Note that only single enum values but no combined ones are allowed. The default is [ON_EDGE][EdgeSides].
   * @return A label parameter that describes the provided parameters for this model instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-createParameterFromCenter">Online Documentation</a>
   */
  fun createParameterFromCenter(
    segmentRatio: Double  = definedExternally,
    sideOfEdge: EdgeSides  = definedExternally,
  ): EdgeSegmentLabelModelParameter
  
  /**
   * Creates a parameter that describes the provided segment index and ratio from the source side of the edge path.
   * @param [segmentIndex] The zero-based index of the segment beginning from the source side.
   * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of 0.0 will place the label at the source side of the segment, a ratio of 1.0 at the target side. Ratios < 0.0 or > 1.0 will be interpreted as absolute values in world coordinates. The default is 0.5.
   * @param [sideOfEdge] The side of the edge the label is placed on. Note that only single enum values but no combined ones are allowed. The default is [ON_EDGE][EdgeSides].
   * @return A label parameter that describes the provided parameters for this model instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-createParameterFromSource">Online Documentation</a>
   */
  fun createParameterFromSource(
    segmentIndex: Int,
    segmentRatio: Double  = definedExternally,
    sideOfEdge: EdgeSides  = definedExternally,
  ): EdgeSegmentLabelModelParameter
  
  /**
   * Creates a parameter that describes the provided segment index and ratio from the target side of the edge path.
   * @param [segmentIndex] The zero-based index of the segment beginning from the target side.
   * @param [segmentRatio] The ratio at which to place the label at the segment. A ratio of 0.0 will place the label at the target side of the segment, a ratio of 1.0 at the source side. Ratios < 0.0 or > 1.0 will be interpreted as absolute values in world coordinates. The default is 0.5.
   * @param [sideOfEdge] The side of the edge the label is placed on. Note that only single enum values but no combined ones are allowed. The default is [ON_EDGE][EdgeSides].
   * @return A label parameter that describes the provided parameters for this model instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-createParameterFromTarget">Online Documentation</a>
   */
  fun createParameterFromTarget(
    segmentIndex: Int,
    segmentRatio: Double  = definedExternally,
    sideOfEdge: EdgeSides  = definedExternally,
  ): EdgeSegmentLabelModelParameter
  
  /**
   * Tries to find a parameter that best matches the given layout for the provided label instance.
   * @param [label] The label to find a parameter for.
   * @param [layout] The anticipated layout for the label.
   * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-findBestParameter">Online Documentation</a>
   */
  fun findBestParameter(
    label: ILabel,
    layout: IOrientedRectangle,
  ): ILabelModelParameter
  
  /**
   * Returns an empty context.
   * @param [label] The label to use in the context.
   * @return An empty context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-getContext">Online Documentation</a>
   */
  final override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentLabelModel%23EdgeSegmentLabelModel-method-getGeometry">Online Documentation</a>
   */
  final override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<EdgeSegmentLabelModel> {
  }
}

inline fun EdgeSegmentLabelModel(
    block: EdgeSegmentLabelModel.() -> Unit
): EdgeSegmentLabelModel {
    return EdgeSegmentLabelModel()
        .apply(block)
}
