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
import yfiles.lang.InterfaceMetadata

/**
 * Defines the geometry of [IPort] instances with respect to specific [IPortLocationModelParameter]s.
 * @see [IPortLocationModelParameter]
 * @see [IPort]
 * @see [IGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModel">Online Documentation</a>
 */
external interface IPortLocationModel  {
  /**
   * Factory method that creates a parameter for the given `owner` that tries to match the provided location in absolute world coordinates.
   * @param [owner] The port owner that will own the port for which the parameter shall be created.
   * @param [location] The location in the world coordinate system that should be matched as best as possible.
   * @return A new instance that can be used to describe the location of an [IPort] at the given `owner`.
   * @throws ArgumentError `location` contains one or more `NaN` values.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModel%23IPortLocationModel-method-createParameter">Online Documentation</a>
   */
  fun createParameter(
    owner: IPortOwner,
    location: Point,
  ): IPortLocationModelParameter
  
  /**
   * Provides a [lookup context][ILookup] for the given port.
   * @param [port] The port to use in the context.
   * @return An implementation of the [ILookup] interface that can be used to query additional aspects of the port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModel%23IPortLocationModel-method-getContext">Online Documentation</a>
   */
  fun getContext(
    port: IPort,
  ): ILookup
  
  /**
   * Determines the location of the port for the given parameter.
   * @param [port] The port to determine the location for.
   * @param [locationParameter] The parameter to use. The parameter can be expected to be created by this instance having the [model][IPortLocationModelParameter] property set to this instance.
   * @return The calculated location of the port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModel%23IPortLocationModel-method-getLocation">Online Documentation</a>
   */
  fun getLocation(
    port: IPort,
    locationParameter: IPortLocationModelParameter,
  ): Point

  
  companion object : InterfaceMetadata<IPortLocationModel> {
  }
}
