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
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata

/**
 * A port location model that places the port on the edge path at a specified ratio.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel">Online Documentation</a>
 */
external class EdgePathPortLocationModel private constructor() : IPortLocationModel {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel%23EdgePathPortLocationModel-method-createParameter">Online Documentation</a>
   */
  override fun createParameter(
    owner: IPortOwner,
    location: Point,
  ): IPortLocationModelParameter
  
  /**
   * Creates a parameter at the provided edge path ratio.
   * @param [edgePathRatio] The ratio at which to place the port at the edge path. A ratio of `0.0` will place the port at the source side of the edge path, a ratio of `1.0` at the target side. The default is `0.5`.
   * @return A port location parameter at the provided edge path ratio for this model instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel%23EdgePathPortLocationModel-method-createRatioParameter">Online Documentation</a>
   */
  fun createRatioParameter(
    edgePathRatio: Double  = definedExternally,
  ): EdgePathPortLocationModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel%23EdgePathPortLocationModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    port: IPort,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel%23EdgePathPortLocationModel-method-getLocation">Online Documentation</a>
   */
  override fun getLocation(
    port: IPort,
    locationParameter: IPortLocationModelParameter,
  ): Point
  
  companion object : ClassMetadata<EdgePathPortLocationModel> {
    /**
     * A static immutable global instance of this class.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgePathPortLocationModel%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: EdgePathPortLocationModel
  }
}
