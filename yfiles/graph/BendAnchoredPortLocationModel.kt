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
 * An implementation of the [IPortLocationModel] that can create [IPortLocationModelParameter]s that describe the location of ports that are attached to the bends of [IEdge]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel">Online Documentation</a>
 */
external class BendAnchoredPortLocationModel private constructor() : IPortLocationModel {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createParameter">Online Documentation</a>
   */
  override fun createParameter(
    owner: IPortOwner,
    location: Point,
  ): IPortLocationModelParameter
  
  /**
   * Creates a parameter that indicates the location of the bend with index `bendIndex` starting from the source side.
   * @param [bendIndex] The index of the bend counting from the source side.
   * @return A parameter that anchors the port at a bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createParameterFromSource">Online Documentation</a>
   */
  fun createParameterFromSource(
    bendIndex: Int,
  ): BendAnchoredPortLocationModelParameter
  
  /**
   * Creates a parameter that indicates the location of the bend with index `bendIndex` starting from the target side.
   * @param [bendIndex] The index of the bend counting from the target side.
   * @return A parameter that anchors the port at a bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createParameterFromTarget">Online Documentation</a>
   */
  fun createParameterFromTarget(
    bendIndex: Int,
  ): BendAnchoredPortLocationModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    port: IPort,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-getLocation">Online Documentation</a>
   */
  override fun getLocation(
    port: IPort,
    locationParameter: IPortLocationModelParameter,
  ): Point
  
  companion object : ClassMetadata<BendAnchoredPortLocationModel> {
    /**
     * A parameter that is bound to the first [IBend] of the edge.
     * @see [createParameterFromSource]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23FIRST_BEND">Online Documentation</a>
     */
     val FIRST_BEND: BendAnchoredPortLocationModelParameter
    
    /**
     * A static immutable global instance of this class.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: BendAnchoredPortLocationModel
    
    /**
     * A parameter that is bound to the last [IBend] of the edge.
     * @see [createParameterFromTarget]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23LAST_BEND">Online Documentation</a>
     */
     val LAST_BEND: BendAnchoredPortLocationModelParameter
  }
}
