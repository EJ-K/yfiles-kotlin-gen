// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.IEnumerator
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An implementation of [IPortLocationModel] that can be used to create custom port location models out of existing [IPortLocationModelParameter] instances.
 * @see [addParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GenericPortLocationModel] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-constructor-GenericPortLocationModel">Online Documentation</a>
 */
external  class GenericPortLocationModel  () : IPortLocationModel, IEnumerable<IPortLocationModelParameter> {

/**
 * Gets all parameters that are associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23locationParameters">Online Documentation</a>
 */
final val locationParameters: IEnumerable<IPortLocationModelParameter>
/**
 * This method simply delegates to [addParameter].
 * @param [locationParameter] The parameter to add to this instance.
 * @see [addParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-add">Online Documentation</a>
 */
 final   fun add( locationParameter: IPortLocationModelParameter )

/**
 * This method simply delegates to [addParameter].
 * @param [locationParameter] The parameter to add to this instance.
 * @see [addParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( locationParameter: IPortLocationModelParameter )
/**
 * Adds the given parameter to the [locationParameters] of this instance.
 * @param [locationParameter] The parameter to add to this instance.
 * @return The parameter to use with this model that wraps the given parameter.
 * @see [add]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-addParameter">Online Documentation</a>
 */
 final   fun addParameter( locationParameter: IPortLocationModelParameter ):IPortLocationModelParameter
/**
 * Factory method that creates a parameter for the given `owner` that tries to match the provided location in absolute world coordinates.
 * @param [owner] The port owner that will own the port for which the parameter shall be created.
 * @param [location] The location in the world coordinate system that should be matched as best as possible.
 * @return A new instance that can be used to describe the location of an [IPort] at the given `owner`.
 * @throws ArgumentError `location` contains one or more `NaN` values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-createParameter">Online Documentation</a>
 */
 final override   fun createParameter( owner: IPortOwner ,
 location: Point ):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( port: IPort ,
 locationParameter: IPortLocationModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<IPortLocationModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-getLocation">Online Documentation</a>
 */
 final override   fun getLocation( port: IPort ,
 locationParameter: IPortLocationModelParameter ):Point
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericPortLocationModel%23GenericPortLocationModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<GenericPortLocationModel> {
}
}
