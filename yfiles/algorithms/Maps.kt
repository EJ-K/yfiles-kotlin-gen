// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.collections.IMap
import yfiles.collections.MapEntry
import yfiles.lang.YObject

/**
 * This class provides convenience and transformation services for [INodeMap] and [IEdgeMap], and other layout-related collection types.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps">Online Documentation</a>
 */
external object Maps {
/**
 * Create a [IDataMap] view of the given map.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createDataMap">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createDataMap( map: IMap<K, V> ):IDataMap<K, V>
/**
 * Create an [IEdgeMap] view of the given map.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createEdgeMap">Online Documentation</a>
 */
 final   fun <V : Any>createEdgeMap( map: IMap<Edge, V> ):IEdgeMap<V>
/**
 * Factory method that creates a [IMap] that is a special hash map implementation mainly used by the layout algorithms.
 * @param [entries] The items to optionally populate the set with initially.
 * @return A new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHashMap">Online Documentation</a>
 */
 final   fun <K : Any, V>createHashMap( entries: ICollection<out MapEntry<K, V>>?  = definedExternally):IMap<K, V>
/**
 * Factory method that creates an [ICollection] implementation with set semantics that is a special hash map based implementation mainly used by the layout algorithms.
 * @param [items] The items to optionally populate the set with initially.
 * @return A new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHashSet">Online Documentation</a>
 */
 final   fun <T>createHashSet( items: IEnumerable<T>?  = definedExternally):ICollection<out T>
/**
 * Creates a [IDataMap] that is based on hashing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHashedDataMap">Online Documentation</a>
 */
 final   fun <K : YObject, V : Any>createHashedDataMap():IDataMap<K, V>
/**
 * Creates an [IEdgeMap] that is based on hashing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHashedEdgeMap">Online Documentation</a>
 */
 final   fun <V : Any>createHashedEdgeMap():IEdgeMap<V>
/**
 * Creates a [INodeMap] that is based on hashing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHashedNodeMap">Online Documentation</a>
 */
 final   fun <V : Any>createHashedNodeMap():INodeMap<V>
/**
 * Creates a resettable high performance map for values of type `double`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceDoubleMap(IDataMap,number)">Online Documentation</a>
 */
 final   fun createHighPerformanceDoubleMap( backingMap: IDataMap<Node, Double> ,
 defaultValue: Double ):INodeMap<Double>
/**
 * Creates a resettable high performance map for values of type `double`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceDoubleMap(IDataProvider,IDataAcceptor,number)">Online Documentation</a>
 */
 final   fun createHighPerformanceDoubleMap( backingProvider: IDataProvider<Node, Double> ,
 backingAcceptor: IDataAcceptor<Node, Double> ,
 defaultValue: Double ):INodeMap<Double>
/**
 * Creates a resettable high performance map for values of type `int`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceIntMap(IDataMap,number)">Online Documentation</a>
 */
 final   fun createHighPerformanceIntMap( backingMap: IDataMap<Node, Int> ,
 defaultValue: Int ):INodeMap<Int>
/**
 * Creates a resettable high performance map for values of type `int`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceIntMap(IDataProvider,IDataAcceptor,number)">Online Documentation</a>
 */
 final   fun createHighPerformanceIntMap( backingProvider: IDataProvider<Node, Int> ,
 backingAcceptor: IDataAcceptor<Node, Int> ,
 defaultValue: Int ):INodeMap<Int>
/**
 * Creates a resettable high performance map for values of type `Object`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceMap(IDataMap,Object)">Online Documentation</a>
 */
 final   fun <V : Any>createHighPerformanceMap( backingMap: IDataMap<Node, V> ,
 defaultValue: V? ):INodeMap<V>
/**
 * Creates a resettable high performance map for values of type `Object`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createHighPerformanceMap(IDataProvider,IDataAcceptor,Object)">Online Documentation</a>
 */
 final   fun <V : Any>createHighPerformanceMap( backingProvider: IDataProvider<Node, V> ,
 backingAcceptor: IDataAcceptor<Node, V> ,
 defaultValue: V? ):INodeMap<V>
/**
 * Returns a [IEdgeMap] view of an [Object] array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a [IEdgeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexEdgeMap">Online Documentation</a>
 */
 final   fun <V : Any>createIndexEdgeMap( data: ReadonlyArray<V> ):IEdgeMap<V>
/**
 * Returns a [IEdgeMap] view of a boolean array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a [IEdgeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexEdgeMapForBoolean">Online Documentation</a>
 */
 final   fun createIndexEdgeMapForBoolean( data: ReadonlyArray<Boolean> ):IEdgeMap<Boolean>
/**
 * Returns a [IEdgeMap] view of an int array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a [IEdgeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexEdgeMapForInt">Online Documentation</a>
 */
 final   fun createIndexEdgeMapForInt( data: ReadonlyArray<Int> ):IEdgeMap<Int>
/**
 * Returns a [IEdgeMap] view of a double array defined for edges.
 * @param [data] array data for each edge of a static graph
 * @return a [IEdgeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexEdgeMapForNumber">Online Documentation</a>
 */
 final   fun createIndexEdgeMapForNumber( data: ReadonlyArray<Double> ):IEdgeMap<Double>
/**
 * Returns a [IEdgeMap] view of a double, int, boolean and [Object] array defined for edges.
 * @param [doubleData] double data for each edge of a static graph
 * @param [intData] int data for each edge of a static graph
 * @param [boolData] boolean data for each edge of a static graph
 * @param [objectData] [Object] data for each edge of a static graph
 * @return a [IEdgeMap] view of the given arrays
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexEdgeMapFromArrays">Online Documentation</a>
 */
 final   fun <V : Any>createIndexEdgeMapFromArrays( doubleData: ReadonlyArray<Double> ,
 intData: ReadonlyArray<Int> ,
 boolData: ReadonlyArray<Boolean> ,
 objectData: ReadonlyArray<V> ):IEdgeMap<V>
/**
 * Returns a [INodeMap] view of an [Object] array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a [INodeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexNodeMap">Online Documentation</a>
 */
 final   fun <V : Any>createIndexNodeMap( data: ReadonlyArray<V> ):INodeMap<V>
/**
 * Returns a [INodeMap] view of a boolean array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a [INodeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexNodeMapForBoolean">Online Documentation</a>
 */
 final   fun createIndexNodeMapForBoolean( data: ReadonlyArray<Boolean> ):INodeMap<Boolean>
/**
 * Returns a [INodeMap] view of an int array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a [INodeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexNodeMapForInt">Online Documentation</a>
 */
 final   fun createIndexNodeMapForInt( data: ReadonlyArray<Int> ):INodeMap<Int>
/**
 * Returns a [INodeMap] view of a double array defined for nodes.
 * @param [data] array data for each node of a static graph
 * @return a [INodeMap] view of the given array
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexNodeMapForNumber">Online Documentation</a>
 */
 final   fun createIndexNodeMapForNumber( data: ReadonlyArray<Double> ):INodeMap<Double>
/**
 * Returns a [INodeMap] view of a double, int, boolean and [Object] array defined for nodes.
 * @param [doubleData] double data for each node of a static graph
 * @param [intData] int data for each node of a static graph
 * @param [boolData] boolean data for each node of a static graph
 * @param [objectData] [Object] data for each node of a static graph
 * @return a [INodeMap] view of the given arrays
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createIndexNodeMapFromArrays">Online Documentation</a>
 */
 final   fun <V : Any>createIndexNodeMapFromArrays( doubleData: ReadonlyArray<Double> ,
 intData: ReadonlyArray<Int> ,
 boolData: ReadonlyArray<Boolean> ,
 objectData: ReadonlyArray<V> ):INodeMap<V>
/**
 * Create a [INodeMap] view of the given map.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Maps%23Maps-method-createNodeMap">Online Documentation</a>
 */
 final   fun <V : Any>createNodeMap( map: IMap<Node, V> ):INodeMap<V>
}
