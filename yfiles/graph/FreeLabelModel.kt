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
import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A label model that can be used to describe any position and orientation of a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel">Online Documentation</a>
 */
open external class FreeLabelModel protected constructor() : ILabelModel {
  /**
   * Creates a new label model parameter that places the label at the given absolute position using the provided angle.
   * @param [anchorLocation] The location for the parameter.
   * @param [angle] The angle of rotation. The default is 0.
   * @return A new parameter that is associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23FreeLabelModel-method-createAbsolute">Online Documentation</a>
   */
  fun createAbsolute(
    anchorLocation: Point,
    angle: Double  = definedExternally,
  ): AbsoluteFreeLabelModelParameter
  
  /**
   * Creates a new label at the given dynamic location using the provided angle.
   * @param [location] The location to place the parameter at. That instance is stored by reference.
   * @param [angle] The angle of rotation. The default is 0.
   * @return A new parameter that is associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23FreeLabelModel-method-createAnchored">Online Documentation</a>
   */
  fun createAnchored(
    location: IPoint,
    angle: Double  = definedExternally,
  ): AnchoredFreeLabelModelParameter
  
  /**
   * Creates a new label model parameter that dynamically reads the label layout from the provided instance.
   * @param [layout] The oriented rectangle to dynamically retrieve the values from.
   * @return A new parameter that is associated with this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23FreeLabelModel-method-createDynamic">Online Documentation</a>
   */
  fun createDynamic(
    layout: IOrientedRectangle,
  ): DynamicFreeLabelModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23FreeLabelModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23FreeLabelModel-method-getGeometry">Online Documentation</a>
   */
  final override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<FreeLabelModel> {
    /**
     * A shared public instance that can be used to obtain parameters.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreeLabelModel%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: FreeLabelModel
  }
}
