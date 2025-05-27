// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.Map
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.lang.yclass

/**
 * The basic lookup interface that allows for retrieving implementations for different aspects of the current instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup">Online Documentation</a>
 */
external interface ILookup : YObject {
/**
 * Returns an instance that implements the given type or `null`.
 * @param [type] The type for which an instance shall be returned.
 * @return an instance that is assignable to type or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23ILookup-method-lookup">Online Documentation</a>
 */
   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : InterfaceMetadata<ILookup> {
/**
 * An `ILookup` instance that always returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23EMPTY">Online Documentation</a>
 */
 val EMPTY: ILookup
/**
 * Creates an [ILookup] implementation that wraps an existing [ILookup] instance using an additional lookup implementations.
 * @param [basicLookup] the fallback lookup implementation
 * @param [additionalLookup] the lookup that has precedence over the fallback
 * @return an implementation that decorates the first with the latter
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23ILookup-defaultmethod-createCascadingLookup">Online Documentation</a>
 */
   fun createCascadingLookup( basicLookup: ILookup ,
 additionalLookup: ILookup ):ILookup
/**
 * Creates a dynamic [ILookup] implementation that for each type that the given subject can be assigned to yields that subject.
 * @param [subject] the subject to yield if it is assignable to the type in the lookup query
 * @return an instance that will either yield `subject` or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23ILookup-defaultmethod-createDynamicLookup">Online Documentation</a>
 */
   fun createDynamicLookup( subject: Any ):ILookup
/**
 * Creates a mutable [ILookup] implementation that is backed by an [IMap][yfiles.collections.IMap].
 * @param [backingDictionary] The backing [Map] that is used in the [lookup] calls.
 * @return A mutable [ILookup] implementation that is backed by a dictionary.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23ILookup-defaultmethod-createMapLookup">Online Documentation</a>
 */
   fun createMapLookup( backingDictionary: Map<YClass<*>, Any> ):ILookup
/**
 * Creates a [ILookup] implementation that yields `subject` if `type` is queried.
 * @param [subject] the subject to yield
 * @param [type] the type that should yield the subject
 * @return An [ILookup] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILookup%23ILookup-defaultmethod-createSingleLookup">Online Documentation</a>
 */
   fun <T : YObject>createSingleLookup( subject: T? ,
 type: YClass<T> ):ILookup
}
}

inline fun <reified T : YObject> ILookup.lookup(): T? =
    lookup(T::class.js.yclass)     
    
inline fun <T : YObject> ILookup.lookupValue(type: YClass<T>):T = 
    requireNotNull(lookup(type)) {
        "Unable to lookup type $type"
    }
    
inline fun <reified T : YObject> ILookup.lookupValue(): T =
    lookupValue(T::class.js.yclass)      
